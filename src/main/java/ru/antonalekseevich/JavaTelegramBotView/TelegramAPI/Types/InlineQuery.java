package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class InlineQuery implements TelegramType {

    String id;
    User from;
    String query;
    String offset;
    String chat_type;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
