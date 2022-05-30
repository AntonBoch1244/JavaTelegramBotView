package ru.antonalekseevich.JavaTelegramBotView.EventManagement;

import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event.Event;
import java.util.Stack;

public class EventProcessor extends Thread {

    protected Stack<Event> events = new Stack<>();
    protected volatile boolean lock = false;

    public void lockThread() {
        lock = true;
    }

    public void unlockThread() {
        lock = false;
    }

    public void pushNewEvent(Event event) {
        events.push(event);
    }

    @Override
    public void run() {
        Event event;
        while (!events.isEmpty()) {
            event = events.pop();
            event.attachProcessor(this);
            if (event.getLock()) lockThread();
            event.start();
            while (lock) Thread.onSpinWait(); // Await unlock
            try {
                event.detachProcessor();
            } catch (IllegalAccessException ignored) {}
        }
    }
}
