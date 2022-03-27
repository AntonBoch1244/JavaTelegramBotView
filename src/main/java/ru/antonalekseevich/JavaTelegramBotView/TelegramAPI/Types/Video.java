package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Video implements TelegramType {

    String file_id;
    String file_unique_id;
    int width;
    int height;
    int duration;
    PhotoSize thumb;
    String file_name;
    String mime_type;
    int file_size;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
