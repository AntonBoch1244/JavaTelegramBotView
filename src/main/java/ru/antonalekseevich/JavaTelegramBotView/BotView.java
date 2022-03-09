package ru.antonalekseevich.JavaTelegramBotView;

import java.awt.Frame;

public class BotView {

    Frame mainWindow;

    public BotView() {
        this.mainWindow = new Frame();
        mainWindow.setSize(
                Integer.parseInt(main.BotViewProperties.get("window_width").toString()),
                Integer.parseInt(main.BotViewProperties.get("window_height").toString())
        );
        mainWindow.setTitle("BotUserName".concat(": BotView")); // From received getMe name
        mainWindow.setVisible(true);
    }
}
