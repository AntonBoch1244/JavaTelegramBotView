package ru.antonalekseevich.JavaTelegramBotView.ViewListeners.TextAreas;

import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Request.TelegramRequest;
import ru.antonalekseevich.JavaTelegramBotView.BotView;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event.EEmpty;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Event.Event;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.EventProcessor;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler.HDoNetworkRequest;
import ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler.Handler;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Request.GetUpdates;

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
            EventProcessor ep = new EventProcessor();
            Event event = new EEmpty();
            event.addHandler(new Handler() {
                @Override
                public void handle() {
                    TelegramRequest request = (TelegramRequest) event.getContainer().getResult();
                    String text = request.Returnable.toString();
                    BotView.Debug.append(text);
                }
            });
            event.addHandler(new HDoNetworkRequest());
            event.addHandler(new Handler(){
                @Override
                public void handle() {
                    try {
                        event.getContainer().setResult(new GetUpdates(null));
                    } catch (IllegalAccessException ignored) {}
                }
            });
            ep.pushNewEvent(event);
            ep.start();
        }
    }
}
