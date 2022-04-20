package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class VideoChatScheduled implements TelegramType {

    int start_date;

    @Override
    public void ImportObject(JsonObject object) {
        start_date = object.get("start_date").getAsInt();
    }

    @Override
    public String toString() {
        String returnable = "VideoChatScheduled{";
        returnable += "start_date=" + start_date;
        returnable += "}";
        return returnable;
    }
}
