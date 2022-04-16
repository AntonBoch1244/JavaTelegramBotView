package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class InlineKeyboardButton implements TelegramType {

    String text;
    String url;
    LoginUrl login_url;
    String callback_data;
    String switch_inline_query;
    String switch_inline_query_current_chat;
    CallbackGame callback_game;
    Boolean pay;

    @Override
    public void ImportObject(JsonObject object) {
        text = object.get("text").getAsString();
        JsonElement _object = object.get("url");
        if (_object != null) {
            url = _object.getAsString();
        }
        _object = object.get("login_url");
        if (_object != null) {
            login_url = new LoginUrl();
            login_url.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("callback_data");
        if (_object != null) {
            callback_data = _object.getAsString();
        }
        _object = object.get("switch_inline_query");
        if (_object != null) {
            switch_inline_query = _object.getAsString();
        }
        _object = object.get("switch_inline_query_current_chat");
        if (_object != null) {
            switch_inline_query_current_chat = _object.getAsString();
        }
        _object = object.get("callback_game");
        if (_object != null) {
            callback_game = new CallbackGame();
            callback_game.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("pay");
        if (_object != null) {
            pay = _object.getAsBoolean();
        }
    }
}
