package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ChatAdministratorRights extends TelegramType {

    boolean is_anonymous;
    boolean can_manage_chat;
    boolean can_delete_messages;
    boolean can_manage_video_chats;
    boolean can_restrict_members;
    boolean can_promote_members;
    boolean can_change_info;
    boolean can_invite_users;
    Boolean can_post_messages;
    Boolean can_edit_messages;
    Boolean can_pin_messages;


    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
