package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class CallbackGame extends TelegramType {

    int user_id;
    int score;
    Boolean force;
    Boolean disable_edit_message;
    Integer chat_id;
    Integer message_id;
    String inline_message_id;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
