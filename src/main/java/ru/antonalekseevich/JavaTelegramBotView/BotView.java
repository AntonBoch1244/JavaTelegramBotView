package ru.antonalekseevich.JavaTelegramBotView;

import java.awt.Frame;

public class BotView {

    Frame mainWindow;

    public BotView() {
        main.LogManager.log(System.Logger.Level.DEBUG, "Setting up Window");
        this.mainWindow = new Frame();
        mainWindow.addWindowListener(new BotView_WindowListener());
        mainWindow.setTitle("BotUserName".concat(": BotView")); // From received getMe name
        mainWindow.setVisible(true);
    }
}
