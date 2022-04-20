package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class WebAppInfo implements TelegramType {

    String url;

    @Override
    public void ImportObject(JsonObject object) {
        url = object.get("url").getAsString();
    }

    @Override
    public String toString() {
        String returnable = "WebAppInfo{";
        returnable += "url=" + url;
        returnable += "}";
        return returnable;
    }
}
