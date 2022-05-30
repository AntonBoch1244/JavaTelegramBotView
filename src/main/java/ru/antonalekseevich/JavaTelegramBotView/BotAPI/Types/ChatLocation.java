package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ChatLocation extends TelegramType {

    Location location;
    String address;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
