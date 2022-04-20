package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class WebAppData implements TelegramType {

    String data;
    String button_text;

    @Override
    public void ImportObject(JsonObject object) {
        data = object.get("data").getAsString();
        button_text = object.get("button_text").getAsString();
    }

    @Override
    public String toString() {
        String returnable = "WebAppData{";
        returnable += "data=" + data;
        returnable += ", button_text=" + button_text;
        returnable += "}";
        return returnable;
    }
}
