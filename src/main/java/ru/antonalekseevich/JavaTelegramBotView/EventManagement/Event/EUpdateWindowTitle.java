package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event;

import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler.HDoNetworkRequest;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler.HSetWindowTitle;

public class EUpdateWindowTitle extends Event {

    public EUpdateWindowTitle() {
        super(false, new ResultContainer<>());
        addHandler(new HSetWindowTitle());
        addHandler(new HDoNetworkRequest());
    }
}
