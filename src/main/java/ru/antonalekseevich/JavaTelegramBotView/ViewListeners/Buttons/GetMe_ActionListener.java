package ru.antonalekseevich.JavaTelegramBotView.ViewListeners.Buttons;

import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event.EUpdateWindowTitle;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event.Event;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.EventsProcessor;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler.Handler;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Request.GetMe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetMe_ActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        EventsProcessor ep = new EventsProcessor();
        Event event = new EUpdateWindowTitle();
        event.addHandler(new Handler() {
            @Override
            public void handle() {
                try {
                    event.getContainer().setResult(new GetMe(null));
                } catch (IllegalAccessException ignored) {}
            }
        });
        ep.newEvent(event);
        ep.start();
    }
}
