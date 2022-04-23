package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class CallbackQuery extends TelegramType {

    String id;
    User from;
    Message message;
    String inline_message_id;
    String chat_instance;
    String data;
    String game_short_name;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
