package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class ChosenInlineResult extends TelegramType {

    String result_id;
    User from;
    Location location;
    String inline_message_id;
    String query;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
