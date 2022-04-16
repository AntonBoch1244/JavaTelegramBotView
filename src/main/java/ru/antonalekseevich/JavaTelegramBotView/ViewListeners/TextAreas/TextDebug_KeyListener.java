package ru.antonalekseevich.JavaTelegramBotView.ViewListeners.TextAreas;

import ru.antonalekseevich.JavaTelegramBotView.ClientManager;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request.getUpdates;

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
            ClientManager.queue.push(new getUpdates(null));
            ClientManager.results.pop();
        }
    }
}
