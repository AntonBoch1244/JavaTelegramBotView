package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event;

/**
 * In-event data storage
 * @param <T> {@link #result} type
 */
public class ResultContainer<T> {

    /**
     * @see #attachEvent(Event) Connect event
     * @see #detachEvent() Disconnect event
     */
    private Event event;
    /**
     * @see #getResult() Retriving result
     * @see #setResult(T) Transfer result
     */
    private T result;

    /**
     * Disconnect from {@link Event event}.
     *
     * @exception IllegalAccessException
     *            If {@link #event} thread not {@link Thread#currentThread same}.
     */
    protected void detachEvent() throws IllegalAccessException {
        if (event != null) {
            if (event == Thread.currentThread()) {
                event = null;
            } else {
                String errorMessage = "Event [%s] should do instead.";
                throw new IllegalAccessException(errorMessage.formatted(event));
            }
        }
    }

    /**
     * Connect to supplied {@link Event event}.
     *
     * @param event set {@link #event}
     */
    protected void attachEvent(Event event) {
        if (this.event != event) {
            while (this.event != null) {
                Thread.onSpinWait();
            }
            this.event = event;
        }
    }

    /**
     * Transmit result
     *
     * @param result set {@link #result}
     * @exception IllegalAccessException
     *            If {@link #event} thread not {@link Thread#currentThread() same}.
     */
    public void setResult(T result) throws IllegalAccessException {
        if (this.result != result) {
            if (event == Thread.currentThread()) {
                this.result = result;
            } else {
                String errorMessage = "Event [%s] should set result instead.";
                throw new IllegalAccessException(errorMessage.formatted(event));
            }
        }
    }

    /**
     * Retrieve result
     *
     * @return {@link #result}
     */
    public T getResult() {
        return result;
    }

}
