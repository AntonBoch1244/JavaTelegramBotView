package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class InlineKeyboardMarkup extends TelegramType {

    InlineKeyboardButton[][] inline_keyboard;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
