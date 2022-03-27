package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class MaskPosition implements TelegramType {

    String point;
    float x_shift;
    float y_shift;
    float scale;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
