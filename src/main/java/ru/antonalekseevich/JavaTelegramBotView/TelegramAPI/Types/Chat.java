package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Chat implements TelegramType {

    int id;
    String type;
    String title;
    String username;
    String first_name;
    String last_name;

    boolean isGetChat;

    ChatPhoto chat_photo;
    String bio;
    boolean has_private_forwards;
    String description;
    String invite_link;
    Message private_message;
    ChatPermissions chat_permissions;
    int slow_mode_delay;
    int message_auto_delete_time;
    boolean has_protected_content;
    String sticker_set_name;
    boolean can_set_sticker_set;
    int linked_chat_id;
    ChatLocation location;


    @Override
    public void ImportObject(JsonObject object) {

    }
}
