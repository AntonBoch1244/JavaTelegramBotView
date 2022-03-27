package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import ru.antonalekseevich.JavaTelegramBotView.Main;

public class Update implements TelegramType {

    int update_id;

    // Common messages
    Message message;
    Message edited_message;

    // Channel related
    Message channel_post;
    Message edited_channel_post;

    // Queries related
    InlineQuery inline_query;
    ChosenInlineResult chosen_inline_result;
    CallbackQuery callback_query;
    ShippingQuery shipping_query;
    PreCheckoutQuery pre_checkout_query;

    // Poll
    Poll poll;
    PollAnswer poll_answer;

    // Chat Member
    ChatMemberUpdated my_chat_member;
    ChatMemberUpdated chat_member;

    // Join request
    ChatJoinRequest chat_join_request;

    @Override
    public void ImportObject(JsonObject object) {
        update_id = object.get("update_id").getAsInt();
        boolean passed = false;
        JsonElement _object = object.get("message");
        if (_object != null) {
            passed = true;
            message = new Message();
            message.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("edited_message");
        if (_object != null) {
            passed = true;
            edited_message = new Message();
            edited_message.ImportObject(object.get("edited_message").getAsJsonObject());
        }

        _object = object.get("channel_post");
        if (_object != null) {
            passed = true;
            channel_post = new Message();
            channel_post.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("edited_channel_post");
        if (_object != null) {
            passed = true;
            edited_channel_post = new Message();
            edited_channel_post.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("inline_query");
        if (_object != null) {
            passed = true;
            inline_query = new InlineQuery();
            inline_query.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("chosen_inline_result");
        if (_object != null) {
            passed = true;
            chosen_inline_result = new ChosenInlineResult();
            chosen_inline_result.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("callback_query");
        if (_object != null) {
            passed = true;
            callback_query = new CallbackQuery();
            callback_query.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("shipping_query");
        if (_object != null) {
            passed = true;
            shipping_query = new ShippingQuery();
            shipping_query.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("pre_checkout_query");
        if (_object != null) {
            passed = true;
            pre_checkout_query = new PreCheckoutQuery();
            pre_checkout_query.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("poll");
        if (_object != null) {
            passed = true;
            poll = new Poll();
            poll.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("poll_answer");
        if (_object != null) {
            passed = true;
            poll_answer = new PollAnswer();
            poll_answer.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("my_chat_member");
        if (_object != null) {
            passed = true;
            my_chat_member = new ChatMemberUpdated();
            my_chat_member.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("chat_member");
        if (_object != null) {
            passed = true;
            chat_member = new ChatMemberUpdated();
            chat_member.ImportObject(_object.getAsJsonObject());
        }

        _object = object.get("chat_join_request");
        if (_object != null) {
            passed = true;
            chat_join_request = new ChatJoinRequest();
            chat_join_request.ImportObject(_object.getAsJsonObject());
        }

        if (!passed) {
            Main.LogManager.log(System.Logger.Level.ERROR, "Update object %d incorrect.".formatted(update_id));
        }
    }

}
