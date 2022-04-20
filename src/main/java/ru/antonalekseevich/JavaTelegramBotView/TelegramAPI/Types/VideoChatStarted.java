package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class VideoChatStarted implements TelegramType {
    @Override
    public void ImportObject(JsonObject object) {}

    @Override
    public String toString() {
        String returnable = "VideoChatStarted{";
        returnable += "}";
        return returnable;
    }
}
