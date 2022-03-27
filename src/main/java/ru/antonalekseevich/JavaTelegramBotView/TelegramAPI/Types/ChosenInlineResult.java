package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChosenInlineResult implements TelegramType {

    String result_id;
    User from;


    @Override
    public void ImportObject(JsonObject object) {

    }
}
