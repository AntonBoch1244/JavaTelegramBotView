package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class PassportFile extends TelegramType {

    String file_id;
    String file_unique_id;
    int file_size;
    int file_date;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
