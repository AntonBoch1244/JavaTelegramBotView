package ru.antonalekseevich.JavaTelegramBotView.ViewListeners.TextAreas;

import ru.antonalekseevich.JavaTelegramBotView.BotView;
import ru.antonalekseevich.JavaTelegramBotView.ClientManager;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request.getUpdates;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.Update;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EmptyStackException;
import java.util.Stack;

public class TextDebug_KeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent keyEvent) {}

    @Override
    public void keyPressed(KeyEvent keyEvent) {}

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getExtendedKeyCode() == 116 /* F5 */) {
            ClientManager.queue.push(new getUpdates(null));
            while (true) {
                try {
                    BotView.Debug.append(((Stack<Update>)((RequestSendMethod)ClientManager.results.pop()).Returnable).toString());
                } catch (EmptyStackException ignored) {
                    break;
                }
            }
        }
    }
}
