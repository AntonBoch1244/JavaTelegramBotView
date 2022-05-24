package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event;

public class EventResultContainer<T> {

    protected Event event;

    protected T result;

    protected void detachEvent() throws IllegalAccessException {
        if (Thread.currentThread() == event)
            this.event = null;
        else throw new IllegalAccessException("Event [%s] should do instead.".formatted(event));
    }

    protected void attachEvent(Event event) {
        while (this.event != null) Thread.onSpinWait();
        this.event = event;
    }

    public void setResult(T result) throws IllegalAccessException {
        if (Thread.currentThread() == event)
            this.result = result;
        else
            throw new IllegalAccessException("Event [%s] should set result instead.".formatted(event));
    }

    public T getResult() {
        return result;
    }

}
