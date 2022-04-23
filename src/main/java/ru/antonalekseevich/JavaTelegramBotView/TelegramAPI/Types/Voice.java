package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class Voice extends TelegramType {

    String file_id;
    String file_unique_id;
    int duration;
    String mime_type;
    int file_size;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
