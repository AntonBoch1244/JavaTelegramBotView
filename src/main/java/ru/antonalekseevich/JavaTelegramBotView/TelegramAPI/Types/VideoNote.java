package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class VideoNote extends TelegramType {

    String file_id;
    String file_unique_id;
    int length;
    int duration;
    PhotoSize thumb;
    int file_size;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
