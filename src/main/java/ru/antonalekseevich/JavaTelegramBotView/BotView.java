package ru.antonalekseevich.JavaTelegramBotView;

import ru.antonalekseevich.JavaTelegramBotView.ViewListeners.Buttons.GetMe_ActionListener;
import ru.antonalekseevich.JavaTelegramBotView.ViewListeners.TextAreas.TextDebug_KeyListener;
import ru.antonalekseevich.JavaTelegramBotView.ViewListeners.TextFields.BotToken_KeyListener;
import ru.antonalekseevich.JavaTelegramBotView.ViewListeners.WindowListener;

import java.awt.*;

public class BotView {

    public static Frame MainWindow;

    GridLayout WindowLayout;

    public static TextField BotToken;
    Button GetMe;

    public static TextArea Debug;

    public BotView() {
        Main.LogManager.log(System.Logger.Level.DEBUG, "Setting up Window");
        MainWindow = new Frame();

        WindowLayout = new GridLayout(1, 3);

        Debug = new TextArea();
        Debug.setName("Text_Debug");
        Debug.addKeyListener(new TextDebug_KeyListener());
        Debug.setVisible(true);

        BotToken = new TextField(Main.BotViewProperties.getProperty("api_token"));
        BotToken.setName("TextField_api_token");
        BotToken.addKeyListener(new BotToken_KeyListener());
        BotToken.setVisible(true);

        GetMe = new Button();
        GetMe.setName("Button_Request_GetMe");
        GetMe.addActionListener(new GetMe_ActionListener());
        GetMe.setLabel("Get me.");
        GetMe.setVisible(true);

        WindowLayout.addLayoutComponent("TextField_BotToken", BotToken);
        WindowLayout.addLayoutComponent("Button_Request_GetMe", GetMe);
        WindowLayout.addLayoutComponent("TextArea_Text_Debug", Debug);

        MainWindow.setLayout(WindowLayout);

        MainWindow.add(BotToken);
        MainWindow.add(GetMe);
        MainWindow.add(Debug);

        MainWindow.doLayout();

        MainWindow.addWindowListener(new WindowListener());
        MainWindow.setTitle("BotView"); // From received getMe name
        MainWindow.setVisible(true);
    }
}
