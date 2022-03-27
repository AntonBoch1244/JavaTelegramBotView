package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChatMemberAdministrator extends ChatMember implements TelegramType {

    String status;
    User user;

    // Permissions
    boolean can_be_edited;
    boolean is_anonymous;
    boolean can_manage_chat;
    boolean can_delete_messages;
    boolean can_manage_voice_chats;
    boolean can_restrict_members; // also bans them
    boolean can_promote_members;
    boolean can_change_info;
    boolean can_invite_users;
    boolean can_post_messages;
    boolean can_edit_messages; // for channels only
    boolean can_pin_messages;

    String custom_title;

    @Override
    public void ImportObject(JsonObject object) {
    }
}
