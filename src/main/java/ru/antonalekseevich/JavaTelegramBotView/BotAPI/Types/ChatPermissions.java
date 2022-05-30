package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ChatPermissions extends TelegramType {

    Boolean can_send_messages;
    Boolean can_send_media_messages;
    Boolean can_send_pools;
    Boolean can_send_other_messages;
    Boolean can_add_web_page_previews;
    Boolean can_change_info;
    Boolean can_invite_users;
    Boolean can_pin_messages;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
