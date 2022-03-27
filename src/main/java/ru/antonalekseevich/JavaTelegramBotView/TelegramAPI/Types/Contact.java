package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Contact implements TelegramType {

    String phone_number;
    String first_name;
    String last_name;
    long user_id;
    String vcard;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
