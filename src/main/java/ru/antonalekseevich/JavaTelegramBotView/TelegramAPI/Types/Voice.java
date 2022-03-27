package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Voice implements TelegramType {

    String file_id;
    String file_unique_id;
    int duration;
    String mime_type;
    int file_size;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
