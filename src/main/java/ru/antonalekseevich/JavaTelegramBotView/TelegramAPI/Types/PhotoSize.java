package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class PhotoSize implements TelegramType {

    String file_id;
    String file_unique_id;

    int width;
    int height;
    int file_size;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
