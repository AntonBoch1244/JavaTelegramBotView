package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class Chat extends TelegramType {

    int id;
    String type;
    String title;
    String username;
    String first_name;
    String last_name;
    ChatPhoto chat_photo;
    String bio;
    Boolean has_private_forwards;
    String description;
    String invite_link;
    Message private_message;
    ChatPermissions chat_permissions;
    Integer slow_mode_delay;
    Integer message_auto_delete_time;
    Boolean has_protected_content;
    String sticker_set_name;
    Boolean can_set_sticker_set;
    Integer linked_chat_id;
    ChatLocation location;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
