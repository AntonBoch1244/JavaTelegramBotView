package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ReplyKeyboardMarkup extends TelegramType {

    KeyboardButton[][] keyboard;
    Boolean resize_keyboard;
    Boolean one_time_keyboard;
    String input_field_placeholder;
    Boolean selective;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
