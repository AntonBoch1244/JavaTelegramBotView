package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

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
    Boolean join_to_send_messages; // Added in recent update
    Boolean join_by_request; // Added in recent update
    String description;
    String invite_link;
    Message pinned_message;
    ChatPermissions permissions;
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
