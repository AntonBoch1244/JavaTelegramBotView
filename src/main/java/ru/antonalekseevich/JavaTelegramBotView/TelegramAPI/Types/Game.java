package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Game implements TelegramType {

    String title;
    String description;
    PhotoSize[] photo;
    String text;
    MessageEntity[] text_entities;
    Animation animation;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
