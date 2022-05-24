package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler;

import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event.Event;

public abstract class Handler {

    protected Event event;

    public void attachEvent(Event event) {
        while (this.event != null) Thread.onSpinWait();
        this.event = event;
    }

    public void detachEvent() throws IllegalAccessException {
        if (Thread.currentThread() == event)
            this.event = null;
        else throw new IllegalAccessException("Event [%s] should do this instead.".formatted(event));
    }

    public boolean isAttached() {
        return event != null;
    }

    public abstract void handle();

}
