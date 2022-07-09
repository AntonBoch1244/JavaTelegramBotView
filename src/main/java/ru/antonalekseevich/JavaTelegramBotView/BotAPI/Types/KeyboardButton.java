package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class KeyboardButton extends TelegramType {

    String text;
    Boolean request_contact;
    Boolean request_location;
    KeyboardButtonPollType request_poll;
    WebAppInfo web_app;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
