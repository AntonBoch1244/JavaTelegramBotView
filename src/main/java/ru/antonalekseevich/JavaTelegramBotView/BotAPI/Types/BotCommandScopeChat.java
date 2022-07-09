package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class BotCommandScopeChat extends BotCommandScope {

    Object chat_id; // Type of String or Integer should detect first

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
