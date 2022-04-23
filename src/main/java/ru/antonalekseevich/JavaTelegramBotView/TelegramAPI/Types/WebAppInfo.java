package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class WebAppInfo extends TelegramType {

    String url;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
