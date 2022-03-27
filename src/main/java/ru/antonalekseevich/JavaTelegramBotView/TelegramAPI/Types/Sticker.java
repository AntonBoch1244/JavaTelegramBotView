package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Sticker implements TelegramType {

    String file_id;
    String file_unique_id;
    int width;
    int height;
    boolean is_animated; // tgz file
    boolean is_video; // webm file
    PhotoSize thumb;
    String emoji;
    String set_name;
    MaskPosition mask_position;
    int file_size;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
