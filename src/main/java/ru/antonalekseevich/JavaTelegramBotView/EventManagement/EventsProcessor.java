package ru.antonalekseevich.JavaTelegramBotView.EventManagement;

import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event.Event;
import java.util.Stack;

public class EventsProcessor extends Thread {

    protected Stack<Event> events = new Stack<>();
    protected volatile boolean lock = false;

    public void LockThread() {
        lock = true;
    }

    public void UnlockThread() {
        lock = false;
    }

    public void newEvent(Event event) {
        events.push(event);
    }

    @Override
    public void run() {
        Event event;
        while (!events.isEmpty()) {
            event = events.pop();
            event.attachProcessor(this);
            if (event.getLock()) LockThread();
            event.start();
            while (lock) Thread.onSpinWait(); // Await unlock
            try {
                event.detachProcessor();
            } catch (IllegalAccessException ignored) {}
        }
    }
}
