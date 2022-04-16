package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class MessageAutoDeleteTimerChanged implements TelegramType {

    int message_auto_delete_time;

    @Override
    public void ImportObject(JsonObject object) {
        message_auto_delete_time = object.get("message_auto_delete_time").getAsInt();
    }

    @Override
    public String toString() {
        String returnable = "MessageAutoDeleteTimerChanged{";
        returnable += "message_auto_delete_time=" + message_auto_delete_time;
        returnable += "}";
        return returnable;
    }
}
