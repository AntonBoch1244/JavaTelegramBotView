package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ForceReply extends TelegramType {

    boolean force_reply;
    String input_field_placeholder;
    Boolean selective;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
