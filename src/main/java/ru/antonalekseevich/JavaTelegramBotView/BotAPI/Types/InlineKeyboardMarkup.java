package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class InlineKeyboardMarkup extends TelegramType {

    InlineKeyboardButton[][] inline_keyboard;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
