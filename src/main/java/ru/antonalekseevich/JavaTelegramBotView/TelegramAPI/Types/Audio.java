package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class Audio extends TelegramType {

    String file_id;
    String file_unique_id;
    int duration;
    String performer;
    String title;
    String file_name;
    String mime_type;
    Integer file_size;
    PhotoSize thumb;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
