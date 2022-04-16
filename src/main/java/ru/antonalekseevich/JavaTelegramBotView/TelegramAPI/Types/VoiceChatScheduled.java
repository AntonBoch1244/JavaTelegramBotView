package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class VoiceChatScheduled implements TelegramType {

    int start_date;

    @Override
    public void ImportObject(JsonObject object) {
        start_date = object.get("start_date").getAsInt();
    }

    @Override
    public String toString() {
        String returnable = "VoiceChatScheduled{";
        returnable += "start_date=" + start_date;
        returnable += "}";
        return returnable;
    }
}
