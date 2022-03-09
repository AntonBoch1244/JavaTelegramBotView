package ru.antonalekseevich.JavaTelegramBotView;

import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class BotView_WindowListener implements WindowListener {
    @Override
    public void windowOpened(WindowEvent windowEvent) {
        windowEvent.getWindow().setSize(
                Integer.parseInt(main.BotViewProperties.get("window_width").toString()),
                Integer.parseInt(main.BotViewProperties.get("window_height").toString())
        );
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        main.LogManager.log(System.Logger.Level.INFO, "Gracefully saving settings and exiting.");

        Dimension window_size = windowEvent.getWindow().getSize();
        main.BotViewProperties.put("window_width", String.valueOf(window_size.width));
        main.BotViewProperties.put("window_height", String.valueOf(window_size.height));

        windowEvent.getWindow().setVisible(false);
        windowEvent.getWindow().dispose();
    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {
        try {
            main.BotViewProperties.store(new FileOutputStream("bot.properties"), "Saved state");
            main.LogManager.log(System.Logger.Level.INFO, "Settings saved.");
        } catch (IOException IOError) {
            main.LogManager.log(System.Logger.Level.ERROR, "Failed: ".concat(IOError.getLocalizedMessage()));
        }
        main.LogManager.log(System.Logger.Level.INFO, "Closed.");
    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {
        // Resume? sync with server
    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {
        // Pause? sync with server
    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {
        // Restore to every 5? seconds sync with server
    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {
        // Slowdown to every 20? seconds sync with server
    }
}
