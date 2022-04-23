package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class LoginUrl extends TelegramType {

    String url;
    String forward_text;
    String bot_username;
    Boolean request_write_access;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
