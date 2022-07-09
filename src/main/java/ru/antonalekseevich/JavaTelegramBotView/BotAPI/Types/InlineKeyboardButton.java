package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class InlineKeyboardButton extends TelegramType {

    String text;
    String url;
    String callback_data;
    WebAppInfo web_app;
    LoginUrl login_url;
    String switch_inline_query;
    String switch_inline_query_current_chat;
    CallbackGame callback_game;
    Boolean pay;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
