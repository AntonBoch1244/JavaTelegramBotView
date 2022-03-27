package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class PreCheckoutQuery implements TelegramType {

    String id;
    User from;
    String currency;
    int total_amount;
    String invoice_payload;
    String shipping_option_id;
    OrderInfo order_info;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
