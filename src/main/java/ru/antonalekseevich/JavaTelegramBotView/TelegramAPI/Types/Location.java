package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Location implements TelegramType {

    float longitude;
    float latitude;
    float horizontal_accuracy;
    int live_period;
    int heading;
    int proximity_alert_radius;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
