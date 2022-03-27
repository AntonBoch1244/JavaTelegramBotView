package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Message implements TelegramType {

    int message_id;
    User from;
    Chat sender_chat;
    int date;
    Chat chat;
    User forward_from;
    Chat forward_from_chat;
    int forward_from_message_id;
    String forward_signature;
    String forward_sender_name;
    int forward_date;
    boolean is_automatic_forward;
    Message reply_to_message;
    User via_bot;
    int edit_date;
    boolean has_protected_content;
    String media_group_id;
    String author_signature;
    String text;
    MessageEntity[] entities;
    Animation animation;
    Audio audio;
    Document document;
    PhotoSize[] photo;
    Sticker sticker;
    Video video;
    VideoNote video_note;
    Voice voice;
    String caption;
    MessageEntity[] caption_entities;
    Contact contact;
    Dice dice;
    Game game;
    Poll poll;
    Venue venue;
    Location location;
    User[] new_chat_members;
    User left_chat_member;
    String new_chat_title;
    PhotoSize[] new_chat_photo;
    boolean delete_chat_photo;
    boolean group_chat_created;
    boolean supergroup_chat_created;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
