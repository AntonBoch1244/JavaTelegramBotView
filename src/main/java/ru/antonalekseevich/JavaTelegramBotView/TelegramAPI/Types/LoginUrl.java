package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class LoginUrl implements TelegramType {

    String url;
    String forward_text;
    String bot_username;
    Boolean request_write_access;

    @Override
    public void ImportObject(JsonObject object) {
        url = object.get("url").getAsString();
        forward_text = object.get("forward_text").getAsString();
        bot_username = object.get("bot_username").getAsString();
        request_write_access = object.get("request_write_access").getAsBoolean();
    }

    @Override
    public String toString() {
        String returnable = "LoginUrl{";
        returnable += "url=" + url;
        if (forward_text != null)
            returnable += ", forward_text=" + forward_text;
        if (bot_username != null)
            returnable += ", bot_username=" + bot_username;
        if (request_write_access != null)
            returnable += ", request_write_access=" + request_write_access;
        returnable += "}";
        return returnable;
    }
}
