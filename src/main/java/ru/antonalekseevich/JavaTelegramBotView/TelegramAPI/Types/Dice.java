package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Dice implements TelegramType {

    String emoji;
    byte value;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
