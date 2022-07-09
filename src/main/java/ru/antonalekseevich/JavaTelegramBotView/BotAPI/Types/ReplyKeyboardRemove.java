package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ReplyKeyboardRemove extends TelegramType {

    Boolean remove_keyboard;
    Boolean selective;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
