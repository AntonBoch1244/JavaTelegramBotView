package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class VoiceChatEnded implements TelegramType {

    int duration;

    @Override
    public void ImportObject(JsonObject object) {
        duration = object.get("duration").getAsInt();
    }

    @Override
    public String toString() {
        String returnable = "VoiceChatEnded{";
        returnable += "duration=" + duration;
        returnable += "}";
        return returnable;
    }
}
