package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class UserProfilePhotos extends TelegramType {

    int total_count;
    PhotoSize[][] photos; // why?

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
