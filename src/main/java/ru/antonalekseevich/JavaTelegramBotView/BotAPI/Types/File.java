package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class File extends TelegramType {

    // LIMIT 20 MEGABYTES!!! CAN BE OVERRIDE BY SCHEMA

    String file_id;
    String file_unique_id;
    Integer file_size;
    String file_path;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
