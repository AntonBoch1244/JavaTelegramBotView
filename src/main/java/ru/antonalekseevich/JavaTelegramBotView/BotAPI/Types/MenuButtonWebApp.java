package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class MenuButtonWebApp extends MenuButton {

    String text;
    WebAppInfo web_app;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
