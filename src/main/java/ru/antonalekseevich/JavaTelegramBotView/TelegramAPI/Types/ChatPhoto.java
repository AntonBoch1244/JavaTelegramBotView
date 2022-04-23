package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class ChatPhoto extends TelegramType {

    String small_file_id;
    String small_file_unique_id;
    String big_file_id;
    String big_file_unique_id;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
