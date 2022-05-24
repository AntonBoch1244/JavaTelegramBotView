package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event;

public class EEmpty extends Event {

    public EEmpty() {
        super(true, new EventResultContainer());
    }

}
