package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

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
