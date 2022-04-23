package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class ChatMemberRestricted extends ChatMember {

    boolean is_member;
    boolean can_change_info;
    boolean can_invite_users;
    boolean can_pin_messages;
    boolean can_send_messages;
    boolean can_send_media_messages;
    boolean can_send_polls;
    boolean can_send_other_messages;
    boolean can_add_web_page_previews;
    int until_date;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
