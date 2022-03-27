package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class OrderInfo implements TelegramType {

    String name;
    String phone_number;
    String email;
    ShippingAddress shipping_address;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
