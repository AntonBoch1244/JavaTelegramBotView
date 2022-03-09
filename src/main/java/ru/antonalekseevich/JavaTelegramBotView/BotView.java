package ru.antonalekseevich.JavaTelegramBotView;

import java.awt.Frame;

public class BotView {

    Frame MainWindow;

    public BotView() {
        Main.LogManager.log(System.Logger.Level.DEBUG, "Setting up Window");
        this.MainWindow = new Frame();
        MainWindow.addWindowListener(new BotView_WindowListener());
        MainWindow.setTitle("BotUserName".concat(": BotView")); // From received getMe name
        MainWindow.setVisible(true);
    }
}
