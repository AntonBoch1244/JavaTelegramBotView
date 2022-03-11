package ru.antonalekseevich.JavaTelegramBotView;

import ru.antonalekseevich.JavaTelegramBotView.ViewListeners.Buttons.GetMe_ActionListener;
import ru.antonalekseevich.JavaTelegramBotView.ViewListeners.WindowListener;

import java.awt.*;

public class BotView {

    public static Frame MainWindow;

    GridLayout WindowLayout;

    Button GetMe;

    public BotView() {
        Main.LogManager.log(System.Logger.Level.DEBUG, "Setting up Window");
        MainWindow = new Frame();

        WindowLayout = new GridLayout(1, 3);

        GetMe = new Button();
        GetMe.setName("Button_Request_GetMe");
        GetMe.addActionListener(new GetMe_ActionListener());
        GetMe.setLabel("Get me.");
        GetMe.setVisible(true);

        WindowLayout.addLayoutComponent("Button_Request_GetMe", GetMe);

        MainWindow.setLayout(WindowLayout);

        MainWindow.add(GetMe);

        MainWindow.doLayout();

        MainWindow.addWindowListener(new WindowListener());
        MainWindow.setTitle("BotView"); // From received getMe name
        MainWindow.setVisible(true);
    }
}
