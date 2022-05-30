package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class Update extends TelegramType {

    int update_id;
    Message message;
    Message edited_message;
    Message channel_post;
    Message edited_channel_post;
    InlineQuery inline_query;
    ChosenInlineResult chosen_inline_result;
    CallbackQuery callback_query;
    ShippingQuery shipping_query;
    PreCheckoutQuery pre_checkout_query;
    Poll poll;
    PollAnswer poll_answer;
    ChatMemberUpdated my_chat_member;
    ChatMemberUpdated chat_member;
    ChatJoinRequest chat_join_request;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
