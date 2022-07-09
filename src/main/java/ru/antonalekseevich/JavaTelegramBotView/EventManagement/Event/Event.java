package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event;

import ru.antonalekseevich.JavaTelegramBotView.EventManagement.EventProcessor;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler.Handler;

import java.util.Arrays;
import java.util.Stack;

/**
 * Event
 */
public abstract class Event extends Thread {

    /**
     * @see #attachProcessor(EventProcessor) Connect processor
     * @see #detachProcessor() Disconnect processor
     */
    private EventProcessor processor;

    /**
     * Not process next event until this done.
     *
     * @see #getLock() Retrive lock status
     */
    private final boolean LOCKED;

    /**
     * @see #getContainer() Retrive data storage
     */
    private final ResultContainer result;

    /**
     * {@link Stack} of {@link Handler handlers}.
     *
     * @see #addHandler(Handler) Add handler
     */
    private final Stack<Handler> handlers = new Stack<>();

    /**
     * Connect to supplied {@link EventProcessor processor}.
     *
     * @param processor set {@link #processor}
     */
    public void attachProcessor(EventProcessor processor) {
        if (this.processor != processor) {
            while (this.processor != null) {
                Thread.onSpinWait();
            }
            this.processor = processor;
        }
    }

    /**
     * Disconnect from {@link EventProcessor processor}.
     *
     * @exception IllegalAccessException
     *            If {@link #processor} thread not {@link Thread#currentThread() same}.
     */
    public void detachProcessor() throws IllegalAccessException {
        if (processor != null) {
            if (processor == Thread.currentThread()) {
                processor = null;
            } else {
                String error_message = "Processor [%s] should do this instead.";
                throw new IllegalAccessException(error_message.formatted(processor));
            }
        }
    }

    /**
     * Retrieve lock status
     *
     * @return {@link #LOCKED lock} status
     */
    public boolean getLock() {
        return LOCKED;
    }

    public ResultContainer getContainer() {
        return result;
    }

    public void addHandler(Handler handler) {
        handlers.push(handler);
        while (handler.isAttached()) {
            Thread.onSpinWait();
        }
        handler.attachEvent(this);
    }

    @Override
    public void run() {
        Handler handler;
        while (!handlers.isEmpty()) {
            handler = handlers.pop();
            if (handler == null) {
                continue;
            }
            handler.handle();
            try {
                handler.detachEvent();
            } catch (IllegalAccessException ignored) {}
        }
        try {
            if (result != null) {
                result.detachEvent();
            }
        } catch (IllegalAccessException ignored) {}
        if (LOCKED) {
            processor.unlockThread();
        }
    }

    public Event() {
        this(false);
    }
    public Event(boolean locked) {
        this(locked, null);
    }
    public Event(boolean locked, ResultContainer result) {
        this(locked, result, (Handler[]) null);
    }

    public Event(boolean locked, ResultContainer result, Handler... handlers) {
        this.LOCKED = locked;
        this.result = result;
        if (result != null) {
            result.attachEvent(this);
        }
        if (handlers != null) {
            Arrays.stream(handlers).forEach(this::addHandler);
        }
    }
}
