package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event;

import ru.antonalekseevich.JavaTelegramBotView.EventManagement.EventProcessor;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler.Handler;

import java.util.Arrays;
import java.util.Stack;

public abstract class Event extends Thread {

    protected EventProcessor processor;

    protected boolean locked;
    protected EventResultContainer result;

    protected Stack<Handler> handlers = new Stack<>();

    public void attachProcessor(EventProcessor processor) {
        while (this.processor != null) Thread.onSpinWait();
        this.processor = processor;
    }

    public void detachProcessor() throws IllegalAccessException {
        if (Thread.currentThread() == processor) {
            this.processor = null;
        } else {
            String error_message = "Processor [%s] should do this instead.";
            throw new IllegalAccessException(error_message.formatted(processor));
        }
    }

    public boolean getLock() {
        return locked;
    }

    public EventResultContainer getContainer() {
        return result;
    }

    public void addHandler(Handler handler) {
        handlers.push(handler);
        while (handler.isAttached()) Thread.onSpinWait();
        handler.attachEvent(this);
    }

    @Override
    public void run() {
        Handler handler;
        while (!handlers.isEmpty()) {
            handler = handlers.pop();
            handler.handle();
            try {
                handler.detachEvent();
            } catch (IllegalAccessException ignored) {}
        }
        try {
            if (result != null) result.detachEvent();
        } catch (IllegalAccessException ignored) {}
        if (locked) processor.unlockThread();
    }

    public Event() {
        this(false);
    }
    public Event(boolean locked) {
        this(locked, null);
    }
    public Event(boolean locked, EventResultContainer result) {
        this(locked, result, (Handler[]) null);
    }

    public Event(boolean locked, EventResultContainer result, Handler... handlers) {
        this.locked = locked;
        this.result = result;
        if (result != null) result.attachEvent(this);
        if (handlers != null) Arrays.stream(handlers).forEach(this::addHandler);
    }
}
