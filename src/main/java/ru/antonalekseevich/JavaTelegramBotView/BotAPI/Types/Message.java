package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class Message extends TelegramType {

    int message_id;
    User from;
    Chat sender_chat;
    int date;
    Chat chat;
    User forward_from;
    Chat forward_from_chat;
    Integer forward_from_message_id;
    String forward_signature;
    String forward_sender_name;
    Integer forward_date;
    Boolean is_automatic_forward;
    Message reply_to_message;
    User via_bot;
    Integer edit_date;
    Boolean has_protected_content;
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
    Boolean delete_chat_photo;
    Boolean group_chat_created;
    Boolean supergroup_chat_created;
    Boolean channel_chat_created;
    MessageAutoDeleteTimerChanged message_auto_delete_timer_changed;
    Integer migrate_to_chat_id;
    Integer migrate_from_chat_id;
    Message pinned_message;
    Invoice invoice;
    SuccessfulPayment successful_payment;
    String connected_website;
    PassportData passport_data;
    ProximityAlertTrigger proximity_alert_trigger;
    VideoChatScheduled video_chat_scheduled;
    VideoChatStarted video_chat_started;
    VideoChatEnded video_chat_ended;
    VideoChatParticipantsInvited video_chat_participants_invited;
    WebAppData web_app_data;
    InlineKeyboardMarkup reply_markup;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
