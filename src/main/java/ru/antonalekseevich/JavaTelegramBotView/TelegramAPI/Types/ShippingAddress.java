package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ShippingAddress implements TelegramType {

    String country_code;
    String state;
    String city;
    String street_line1;
    String street_line2;
    String post_code;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
