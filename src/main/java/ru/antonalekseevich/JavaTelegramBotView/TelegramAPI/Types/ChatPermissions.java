package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChatPermissions implements TelegramType {

    boolean can_send_messages;
    boolean can_send_media_messages;
    boolean can_send_pools;
    boolean can_send_other_messages;
    boolean can_add_web_page_previews;
    boolean can_change_info;
    boolean can_invite_users;
    boolean can_pin_messages;

    @Override
    public void ImportObject(JsonObject object) {
        can_send_messages = object.get("can_send_messages").getAsBoolean();
        can_send_media_messages = object.get("can_send_media_messages").getAsBoolean();
        can_send_pools = object.get("can_send_pools").getAsBoolean();
        can_send_other_messages = object.get("can_send_other_messages").getAsBoolean();
        can_add_web_page_previews = object.get("can_add_web_page_previews").getAsBoolean();
        can_change_info = object.get("can_change_info").getAsBoolean();
        can_invite_users = object.get("can_invite_users").getAsBoolean();
        can_pin_messages = object.get("can_pin_messages").getAsBoolean();
    }
}
