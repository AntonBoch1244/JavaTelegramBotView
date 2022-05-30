package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class WebAppData extends TelegramType {

    String data;
    String button_text;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
