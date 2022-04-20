package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class VideoChatEnded implements TelegramType {

    int duration;

    @Override
    public void ImportObject(JsonObject object) {
        duration = object.get("duration").getAsInt();
    }

    @Override
    public String toString() {
        String returnable = "VideoChatEnded{";
        returnable += "duration=" + duration;
        returnable += "}";
        return returnable;
    }
}
