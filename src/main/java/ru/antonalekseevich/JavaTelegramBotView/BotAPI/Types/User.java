package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class User extends TelegramType {

    int id;
    boolean is_bot;
    String first_name;

    String last_name;
    public String username;
    String language_code;
    Boolean is_premium; // In recent update of TG Bot API
    Boolean added_to_attachment; // In recent update of TG Bot API

    Boolean can_join_groups;
    Boolean can_read_all_group_messages;
    Boolean supports_inline_queries;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
