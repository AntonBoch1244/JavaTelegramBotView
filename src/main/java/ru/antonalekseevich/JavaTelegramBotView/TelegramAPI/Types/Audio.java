package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Audio implements TelegramType {

    String file_id;
    String file_unique_id;
    int duration;
    String performer;
    String title;
    String file_name;
    String mime_type;
    int file_size;
    PhotoSize thumb;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
