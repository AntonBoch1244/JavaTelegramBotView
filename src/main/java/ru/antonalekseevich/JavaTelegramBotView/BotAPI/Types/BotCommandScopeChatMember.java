package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class BotCommandScopeChatMember extends BotCommandScope {

    Object chat_id; // Type of String or Integer should detect first
    Integer user_id;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
