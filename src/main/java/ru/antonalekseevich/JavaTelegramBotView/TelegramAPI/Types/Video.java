package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class Video extends TelegramType {

    String file_id;
    String file_unique_id;
    int width;
    int height;
    int duration;
    PhotoSize thumb;
    String file_name;
    String mime_type;
    int file_size;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
