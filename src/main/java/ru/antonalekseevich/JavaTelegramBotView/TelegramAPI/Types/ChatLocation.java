package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChatLocation implements TelegramType {

    Location location;
    String address;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
