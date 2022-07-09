package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class MessageId extends TelegramType {

    int message_id;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
