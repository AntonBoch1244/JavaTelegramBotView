package ru.antonalekseevich.JavaTelegramBotView;

import java.awt.Frame;
import java.io.*;
import java.util.Properties;

public class BotView {

    Properties WindowProperty = new Properties();

    Frame mainWindow;

    public void loadProperties() {
        try {
            WindowProperty.load(new FileInputStream("bot.properties"));
        } catch (FileNotFoundException filenotavailable) {
            WindowProperty.put("window_width", "1280");
            WindowProperty.put("window_height", "720");
            try {
                WindowProperty.store(new FileOutputStream("bot.properties"), "Default window settings");
            } catch (IOException ignored) {}
        } catch (IOException ignored) {}
    }

    public BotView() {
        loadProperties();
        this.mainWindow = new Frame();
        mainWindow.setSize(Integer.parseInt(WindowProperty.get("window_width").toString()), Integer.parseInt(WindowProperty.get("window_height").toString())); // From properties file
        mainWindow.setTitle("TestWindow".concat(": BotView")); // From received getMe name
        mainWindow.setVisible(true);
    }
}
