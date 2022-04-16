package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class User implements TelegramType {
    int id;
    boolean is_bot;
    String first_name;

    String last_name;
    public String username;
    String language_code;

    Boolean can_join_groups;
    Boolean can_read_all_group_messages;
    Boolean supports_inline_queries;

    @Override
    public void ImportObject(JsonObject object) {
        id = object.get("id").getAsInt();
        is_bot = object.get("is_bot").getAsBoolean();
        first_name = object.get("first_name").getAsString();
        JsonElement _object = object.get("last_name");
        if (_object != null)
            last_name = _object.getAsString();
        _object = object.get("username");
        if (_object != null)
            username = _object.getAsString();
        _object = object.get("language_code");
        if (_object != null)
            language_code = _object.getAsString();
        _object = object.get("can_join_groups");
        if (_object != null)
            can_join_groups = _object.getAsBoolean();
        _object = object.get("can_read_all_group_messages");
        if (_object != null)
            can_read_all_group_messages = _object.getAsBoolean();
        _object = object.get("supports_inline_queries");
        if (_object != null)
            supports_inline_queries = _object.getAsBoolean();
    }

    public String toString() {
        String returnable = "User{";
        returnable += "id=" + id;
        returnable += ", is_bot=" + is_bot;
        returnable += ", first_name=" + first_name;
        if (last_name != null)
            returnable += ", last_name=" + last_name;
        if (username != null)
            returnable += ", username=" + username;
        if (language_code != null)
            returnable += ", language_code=" + language_code;
        if (can_join_groups != null)
            returnable += ", can_join_groups=" + can_join_groups;
        if (can_read_all_group_messages != null)
            returnable += ", can_read_all_group_messages=" + can_read_all_group_messages;
        if (supports_inline_queries != null)
            returnable += ", supports_inline_queries=" + supports_inline_queries;
        returnable += "}";
        return returnable;

    }
}
