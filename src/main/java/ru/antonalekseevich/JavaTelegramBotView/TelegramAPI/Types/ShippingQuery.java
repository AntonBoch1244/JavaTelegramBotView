package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ShippingQuery implements TelegramType {

    String id;
    User from;
    String invoice_payload;
    ShippingAddress shipping_address;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
