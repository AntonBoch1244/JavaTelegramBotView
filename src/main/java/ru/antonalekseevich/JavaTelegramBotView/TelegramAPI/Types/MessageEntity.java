package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class MessageEntity implements TelegramType {

    String type;
    int offset;
    int length;
    String url;
    User user;
    String language;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
