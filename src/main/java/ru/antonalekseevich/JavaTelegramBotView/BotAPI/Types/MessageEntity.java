package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class MessageEntity extends TelegramType {

    String type;
    int offset;
    int length;
    String url;
    User user;
    String language;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
