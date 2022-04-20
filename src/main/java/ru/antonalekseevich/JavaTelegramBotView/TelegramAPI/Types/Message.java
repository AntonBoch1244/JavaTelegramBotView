package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Arrays;

public class Message implements TelegramType {

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
    public void ImportObject(JsonObject object) {
        message_id = object.get("message_id").getAsInt();

        JsonElement _object = object.get("from");
        if (_object != null) {
            from = new User();
            from.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("sender_chat");
        if (_object != null) {
            sender_chat = new Chat();
            sender_chat.ImportObject(_object.getAsJsonObject());
        }

        date = object.get("date").getAsInt();

        chat = new Chat();
        chat.ImportObject(object.get("chat").getAsJsonObject());

        _object = object.get("forward_from");
        if (_object != null) {
            forward_from = new User();
            forward_from.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("forward_from_chat");
        if (_object != null) {
            forward_from_chat = new Chat();
            forward_from_chat.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("forward_from_message_id");
        if (_object != null)
            forward_from_message_id = _object.getAsInt();

        _object = object.get("forward_signature");
        if (_object != null)
            forward_signature = _object.getAsString();
        _object = object.get("forward_sender_name");
        if (_object != null)
            forward_sender_name = _object.getAsString();
        _object = object.get("forward_date");
        if (_object != null)
            forward_date = _object.getAsInt();
        _object = object.get("is_automatic_forward");
        if (_object != null)
            is_automatic_forward = _object.getAsBoolean();

        _object = object.get("reply_to_message");
        if (_object != null) {
            reply_to_message = new Message();
            reply_to_message.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("via_bot");
        if (_object != null) {
            via_bot = new User();
            via_bot.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("edit_date");
        if (_object != null)
            edit_date = _object.getAsInt();

        _object = object.get("has_protected_content");
        if (_object != null)
            has_protected_content = _object.getAsBoolean();

        _object = object.get("media_group_id");
        if (_object != null)
            media_group_id = _object.getAsString();

        _object = object.get("author_signature");
        if (_object != null)
            author_signature = _object.getAsString();
        _object = object.get("text");
        if (_object != null)
            text = _object.getAsString();

        _object = object.get("web_app_data");
        if (_object != null) {
            web_app_data = new WebAppData();
            web_app_data.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("entities");
        if (_object != null) {
            JsonArray _object_array = _object.getAsJsonArray();
            entities = new MessageEntity[_object_array.size()];
            for (int item=0; item < entities.length; item++) {
                MessageEntity entity = new MessageEntity();
                entity.ImportObject(_object_array.get(item).getAsJsonObject());
                entities[item] = entity;
            }
        }

        _object = object.get("animation");
        if (_object != null) {
            animation = new Animation();
            animation.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("audio");
        if (_object != null) {
            audio = new Audio();
            audio.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("document");
        if (_object != null) {
            document = new Document();
            document.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("photo");
        if (_object != null) {
            JsonArray _object_array = _object.getAsJsonArray();
            photo = new PhotoSize[_object_array.size()];
            for (int item=0; item < photo.length; item++) {
                PhotoSize _photo = new PhotoSize();
                _photo.ImportObject(_object_array.get(item).getAsJsonObject());
                photo[item] = _photo;
            }
        }

        _object = object.get("sticker");
        if (_object != null) {
            sticker = new Sticker();
            sticker.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("video");
        if (_object != null) {
            video = new Video();
            video.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("video_note");
        if (_object != null) {
            video_note = new VideoNote();
            video_note.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("voice");
        if (_object != null) {
            voice = new Voice();
            voice.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("caption");
        if (_object != null)
            caption = _object.getAsString();

        _object = object.get("caption_entities");
        if (_object != null) {
            JsonArray _object_array = _object.getAsJsonArray();
            caption_entities = new MessageEntity[_object_array.size()];
            for (int item=0; item < caption_entities.length; item++) {
                MessageEntity entity = new MessageEntity();
                entity.ImportObject(_object_array.get(item).getAsJsonObject());
                caption_entities[item] = entity;
            }
        }

        _object = object.get("contact");
        if (_object != null) {
            contact = new Contact();
            contact.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("dice");
        if (_object != null) {
            dice = new Dice();
            dice.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("game");
        if (_object != null) {
            game = new Game();
            game.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("poll");
        if (_object != null) {
            poll = new Poll();
            poll.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("venue");
        if (_object != null) {
            venue = new Venue();
            venue.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("location");
        if (_object != null) {
            location = new Location();
            location.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("new_chat_members");
        if (_object != null) {
            JsonArray _object_array = _object.getAsJsonArray();
            new_chat_members = new User[_object_array.size()];
            for (int item = 0; item < new_chat_members.length; item++) {
                User _user = new User();
                _user.ImportObject(_object_array.get(item).getAsJsonObject());
                new_chat_members[item] = _user;
            }
        }
        _object = object.get("left_chat_member");
        if (_object != null) {
            left_chat_member = new User();
            left_chat_member.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("new_chat_title");
        if (_object != null)
            new_chat_title = _object.getAsString();
        _object = object.get("new_chat_photo");
        if (_object != null) {
            JsonArray _object_array = _object.getAsJsonArray();
            new_chat_photo = new PhotoSize[_object_array.size()];
            for (int item = 0; item < new_chat_photo.length; item++) {
                PhotoSize photo = new PhotoSize();
                photo.ImportObject(_object_array.get(item).getAsJsonObject());
                new_chat_photo[item] = photo;
            }
        }
        _object = object.get("delete_chat_photo");
        if (_object != null)
            delete_chat_photo = _object.getAsBoolean();
        _object = object.get("group_chat_created");
        if (_object != null)
            group_chat_created = _object.getAsBoolean();
        _object = object.get("supergroup_chat_created");
        if (_object != null)
            supergroup_chat_created = _object.getAsBoolean();
        _object = object.get("channel_chat_created");
        if (_object != null)
            channel_chat_created = _object.getAsBoolean();
        _object = object.get("message_auto_delete_timer_changed");
        if (_object != null) {
            message_auto_delete_timer_changed = new MessageAutoDeleteTimerChanged();
            message_auto_delete_timer_changed.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("migrate_to_chat_id");
        if (_object != null)
            migrate_from_chat_id = _object.getAsInt();
        _object = object.get("migrate_from_chat_id");
        if (_object != null)
            migrate_from_chat_id = _object.getAsInt();
        _object = object.get("pinned_message");
        if (_object != null) {
            pinned_message = new Message();
            pinned_message.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("invoice");
        if (_object != null) {
            invoice = new Invoice();
            invoice.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("successful_payment");
        if (_object != null) {
            successful_payment = new SuccessfulPayment();
            successful_payment.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("connected_website");
        if (_object != null)
            connected_website = _object.getAsString();
        _object = object.get("passport_data");
        if (_object != null) {
            passport_data = new PassportData();
            passport_data.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("proximity_alert_trigger");
        if (_object != null) {
            proximity_alert_trigger = new ProximityAlertTrigger();
            proximity_alert_trigger.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("voice_chat_scheduled");
        if (_object != null) {
            video_chat_scheduled = new VideoChatScheduled();
            video_chat_scheduled.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("voice_chat_started");
        if (_object != null) {
            video_chat_started = new VideoChatStarted();
            video_chat_started.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("voice_chat_ended");
        if (_object != null) {
            video_chat_ended = new VideoChatEnded();
            video_chat_ended.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("voice_chat_participants_invited");
        if (_object != null) {
            video_chat_participants_invited = new VideoChatParticipantsInvited();
            video_chat_participants_invited.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("reply_markup");
        if (_object != null) {
            reply_markup = new InlineKeyboardMarkup();
            reply_markup.ImportObject(_object.getAsJsonObject());
        }
    }

    @Override
    public String toString() {
        String returnable = "Message{";
        returnable += "message_id=" + message_id;
        if (from != null)
            returnable += ", from=" + from;
        if (sender_chat != null)
            returnable += ", sender_chat=" + sender_chat;
        returnable += ", date=" + date;
        returnable += ", chat=" + chat;
        if (forward_from !=null)
            returnable += ", forward_from=" + forward_from;
        if (forward_from_chat !=null)
            returnable += ", forward_from_chat=" + forward_from_chat;
        if (forward_from_message_id !=null)
            returnable += ", forward_from_message_id=" + forward_from_message_id;
        if (forward_signature !=null)
            returnable += ", forward_signature=" + forward_signature;
        if (forward_sender_name !=null)
            returnable += ", forward_sender_name=" + forward_sender_name;
        if (forward_date !=null)
            returnable += ", forward_date=" + forward_date;
        if (is_automatic_forward !=null)
            returnable += ", is_automatic_forward=" + is_automatic_forward;
        if (reply_to_message !=null)
            returnable += ", reply_to_message=" + reply_to_message;
        if (via_bot !=null)
            returnable += ", via_bot=" + via_bot;
        if (edit_date !=null)
            returnable += ", edit_date=" + edit_date;
        if (has_protected_content !=null)
            returnable += ", has_protected_content=" + has_protected_content;
        if (media_group_id !=null)
            returnable += ", media_group_id=" + media_group_id;
        if (author_signature !=null)
            returnable += ", author_signature=" + author_signature;
        if (text !=null)
            returnable += ", text=" + text;
        if (entities != null)
            returnable += ", entities=" + Arrays.toString(entities);
        if (animation != null)
            returnable += ", animation=" + animation;
        if (audio != null)
            returnable += ", audio=" + audio;
        if (document != null)
            returnable += ", document=" + document;
        if (photo != null)
            returnable += ", photo=" + Arrays.toString(photo);
        if (sticker != null)
            returnable += ", sticker=" + sticker;
        if (video != null)
            returnable += ", video=" + video;
        if (video_note != null)
            returnable += ", video_note=" + video_note;
        if (voice != null)
            returnable += ", voice=" + voice;
        if (caption != null)
            returnable += ", caption=" + caption;
        if (caption_entities !=null)
            returnable += ", caption_entities=" + Arrays.toString(caption_entities);
        if (contact != null)
            returnable += ", contact=" + contact;
        if (dice != null)
            returnable += ", dice=" + dice;
        if (game != null)
            returnable += ", game=" + game;
        if (poll != null)
            returnable += ", poll=" + poll;
        if (venue != null)
            returnable += ", venue=" + venue;
        if (location != null)
            returnable += ", location=" + location;
        if (new_chat_members != null)
            returnable += ", new_chat_members=" + Arrays.toString(new_chat_members);
        if (left_chat_member != null)
            returnable += ", left_chat_member=" + left_chat_member;
        if (new_chat_title != null)
            returnable += ", new_chat_title=" + new_chat_title;
        if (new_chat_photo !=null)
            returnable += ", new_chat_photo=" + Arrays.toString(new_chat_photo);
        if (delete_chat_photo != null)
            returnable += ", delete_chat_photo=" + delete_chat_photo;
        if (group_chat_created != null)
            returnable += ", group_chat_created=" + group_chat_created;
        if (supergroup_chat_created != null)
            returnable += ", supergroup_chat_created=" + supergroup_chat_created;
        if (channel_chat_created != null)
            returnable += ", channel_chat_created=" + channel_chat_created;
        if (message_auto_delete_timer_changed != null)
            returnable += ", message_auto_delete_timer_changed=" + message_auto_delete_timer_changed;
        if (migrate_to_chat_id != null)
            returnable += ", migrate_to_chat_id=" + migrate_to_chat_id;
        if (migrate_from_chat_id != null)
            returnable += ", migrate_from_chat_id=" + migrate_from_chat_id;
        if (pinned_message != null)
            returnable += ", pinned_message=" + pinned_message;
        if (invoice != null)
            returnable += ", invoice=" + invoice;
        if (successful_payment != null)
            returnable += ", successful_payment=" + successful_payment;
        if (connected_website != null)
            returnable += ", connected_website=" + connected_website;
        if (passport_data != null)
            returnable += ", passport_data=" + passport_data;
        if (proximity_alert_trigger != null)
            returnable += ", proximity_alert_trigger=" + proximity_alert_trigger;
        if (video_chat_scheduled != null)
            returnable += ", video_chat_scheduled=" + video_chat_scheduled;
        if (video_chat_started != null)
            returnable += ", video_chat_started=" + video_chat_started;
        if (video_chat_ended != null)
            returnable += ", video_chat_ended=" + video_chat_ended;
        if (video_chat_participants_invited != null)
            returnable += ", video_chat_participants_invited=" + video_chat_participants_invited;
        if (web_app_data != null)
            returnable += ", web_app_data=" + web_app_data;
        if (reply_markup != null)
            returnable += ", reply_markup=" + reply_markup;
        returnable += "}";
        return returnable;
    }
}
