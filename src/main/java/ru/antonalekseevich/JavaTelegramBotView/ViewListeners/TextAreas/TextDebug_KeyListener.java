package ru.antonalekseevich.JavaTelegramBotView.ViewListeners.TextAreas;

import ru.antonalekseevich.JavaTelegramBotView.BotView;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event.EEmpty;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event.Event;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.EventsProcessor;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler.HDoNetworkRequest;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler.Handler;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request.getUpdates;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextDebug_KeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent keyEvent) {}

    @Override
    public void keyPressed(KeyEvent keyEvent) {}

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getExtendedKeyCode() == 116 /* F5 */) {
            EventsProcessor ep = new EventsProcessor();
            Event event = new EEmpty();
            event.addHandler(new Handler() {
                @Override
                public void handle() {
                    BotView.Debug.append((((RequestSendMethod)event.getContainer().getResult()).Returnable.toString()));
                }
            });
            event.addHandler(new HDoNetworkRequest());
            event.addHandler(new Handler(){
                @Override
                public void handle() {
                    try {
                        event.getContainer().setResult(new getUpdates(null));
                    } catch (IllegalAccessException ignored) {}
                }
            });
            ep.newEvent(event);
            ep.start();
        }
    }
}
