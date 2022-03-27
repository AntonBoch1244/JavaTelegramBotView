package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class PollOption implements TelegramType {

    String text;
    int voter_count;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
