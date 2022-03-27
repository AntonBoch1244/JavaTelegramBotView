package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class PollAnswer implements TelegramType {

    String poll_id;
    User user;
    int[] option_ids;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
