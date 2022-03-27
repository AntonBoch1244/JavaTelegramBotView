package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class VideoNote implements TelegramType {

    String file_id;
    String file_unique_id;
    int length;
    int duration;
    PhotoSize thumb;
    int file_size;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
