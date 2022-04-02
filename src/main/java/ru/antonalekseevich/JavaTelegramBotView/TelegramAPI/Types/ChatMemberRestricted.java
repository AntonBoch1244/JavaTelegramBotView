package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChatMemberRestricted extends ChatMember {

    String status;
    User user;

    boolean is_member;

    // Permissions
    boolean can_change_info;
    boolean can_invite_users;
    boolean can_pin_messages;
    boolean can_send_messages;
    boolean can_send_media_messages;
    boolean can_send_polls;
    boolean can_send_other_messages; // via
    boolean can_add_web_page_previews;

    int until_date;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
