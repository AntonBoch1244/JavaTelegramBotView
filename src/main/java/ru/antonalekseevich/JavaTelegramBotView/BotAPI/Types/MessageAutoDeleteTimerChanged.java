package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class MessageAutoDeleteTimerChanged extends TelegramType {

    int message_auto_delete_time;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
