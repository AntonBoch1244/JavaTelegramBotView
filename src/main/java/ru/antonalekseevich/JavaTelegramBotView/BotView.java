package ru.antonalekseevich.JavaTelegramBotView;

import ru.antonalekseevich.JavaTelegramBotView.ViewListeners.Buttons.GetMe_ActionListener;
import ru.antonalekseevich.JavaTelegramBotView.ViewListeners.WindowListener;

import java.awt.*;

public class BotView {

    Frame MainWindow;

    Button GetMe;

    public BotView() {
        Main.LogManager.log(System.Logger.Level.DEBUG, "Setting up Window");
        MainWindow = new Frame();

        GetMe = new Button();
        GetMe.addActionListener(new GetMe_ActionListener());
        GetMe.setSize(80, 64);
        GetMe.setLabel("Get me.");
        GetMe.setVisible(true);

        MainWindow.add(GetMe);

        MainWindow.addWindowListener(new WindowListener());
        MainWindow.setTitle("BotUserName".concat(": BotView")); // From received getMe name
        MainWindow.setVisible(true);
    }
}
