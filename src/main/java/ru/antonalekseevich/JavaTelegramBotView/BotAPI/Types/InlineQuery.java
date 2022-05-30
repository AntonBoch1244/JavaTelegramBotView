package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class InlineQuery extends TelegramType {

    String id;
    User from;
    String query;
    String offset;
    String chat_type;
    Location location;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
