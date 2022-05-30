package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class Document extends TelegramType {

    String file_id;
    String file_unique_id;
    PhotoSize thumb;
    String file_name;
    String mime_type;
    int file_size;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
