package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class VoiceChatStarted implements TelegramType {
    @Override
    public void ImportObject(JsonObject object) {}

    @Override
    public String toString() {
        String returnable = "VoiceChatStarted{";
        returnable += "}";
        return returnable;
    }
}
