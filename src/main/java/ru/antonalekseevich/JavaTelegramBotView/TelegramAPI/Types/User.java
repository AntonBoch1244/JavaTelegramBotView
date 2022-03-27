package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class User implements TelegramType {
    int id;
    boolean is_bot;
    String first_name;

    // optional
    String last_name;
    String username;
    String language_code;

    protected boolean isGetMe = false;

    // getMe only
    protected boolean can_join_groups;
    protected boolean can_read_all_group_messages;
    protected boolean supports_inline_queries;

    public User() {}

    public int getId() {
        return id;
    }

    public boolean isIs_bot() {
        return is_bot;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getUsername() {
        return username;
    }

    public String getLanguage_code() {
        return language_code;
    }

    @Override
    public void ImportObject(JsonObject user) {
        id = user.get("id").getAsInt();
        is_bot = user.get("is_bot").getAsBoolean();
        first_name = user.get("first_name").getAsString();
        try {
            last_name = user.get("last_name").getAsString();
        } catch (Exception ignore) {}
        try {
            username = user.get("username").getAsString();
        } catch (Exception ignore) {}
        try {
            language_code = user.get("language_code").getAsString();
        } catch (Exception ignore) {}
        try {
            can_join_groups = user.get("can_join_groups").getAsBoolean();
            can_read_all_group_messages = user.get("can_read_all_group_messages").getAsBoolean();
            supports_inline_queries = user.get("supports_inline_queries").getAsBoolean();
            isGetMe = true;
        } catch (Exception ignore) {
            isGetMe = false;
        }
    }

    public String toString() {
        String Result = "User{";
        Result += "id=" + id + ", is_bot" + is_bot + ", first_name=" + first_name;
        if (last_name != null) Result += ", last_name=" + last_name;
        if (username != null) Result += ", username=" + username;
        if (language_code != null) Result += ", language_code=" + language_code;
        if (isGetMe) {
            Result += ", can_join_groups=" + can_join_groups
                    + ", can_read_all_group_messages=" + can_read_all_group_messages
                    + ", supports_inline_queries=" + supports_inline_queries;
        }
        Result += "}";
        return Result;

    }
}
