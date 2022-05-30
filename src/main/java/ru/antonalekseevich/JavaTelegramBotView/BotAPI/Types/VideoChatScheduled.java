package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class VideoChatScheduled extends TelegramType {

    int start_date;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
