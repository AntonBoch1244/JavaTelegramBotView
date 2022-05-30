package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class PhotoSize extends TelegramType {

    String file_id;
    String file_unique_id;
    int width;
    int height;
    Integer file_size;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
