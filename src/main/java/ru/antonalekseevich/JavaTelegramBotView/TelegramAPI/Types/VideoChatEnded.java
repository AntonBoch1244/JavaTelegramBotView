package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class VideoChatEnded extends TelegramType {

    int duration;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
