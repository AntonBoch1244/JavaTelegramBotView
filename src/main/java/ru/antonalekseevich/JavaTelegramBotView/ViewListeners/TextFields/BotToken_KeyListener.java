package ru.antonalekseevich.JavaTelegramBotView.ViewListeners.TextFields;

import ru.antonalekseevich.JavaTelegramBotView.Main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BotToken_KeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent keyEvent) {}

    @Override
    public void keyPressed(KeyEvent keyEvent) {}

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        switch (keyEvent.getExtendedKeyCode()) {
            case 10 /* Enter/Return */ -> {
                Main.BotViewProperties.put("api_token", ((TextField) keyEvent.getSource()).getText());
                Main.LogManager.log(System.Logger.Level.INFO, "API token successfully changed.");
            }
            case 27 /* Esc */ -> {
                ((TextField) keyEvent.getSource()).setText(Main.BotViewProperties.getProperty("api_token"));
                Main.LogManager.log(System.Logger.Level.INFO, "API token canceled changing.");
            }
        }
    }
}
