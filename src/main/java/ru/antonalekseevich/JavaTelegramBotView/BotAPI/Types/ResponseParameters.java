package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ResponseParameters extends TelegramType {

    Integer migrate_to_chat_id;
    Integer retry_after;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
