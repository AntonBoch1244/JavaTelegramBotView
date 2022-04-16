package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class SuccessfulPayment implements TelegramType {

    String currency;
    int total_amount;
    String invoice_payload;
    String shipping_option_id;
    OrderInfo order_info;
    String telegram_payment_charge_id;
    String provider_payment_charge_id;

    @Override
    public void ImportObject(JsonObject object) {
        currency = object.get("currency").getAsString();
        total_amount = object.get("total_amount").getAsInt();
        invoice_payload = object.get("invoice_payload").getAsString();

        JsonElement _object = object.get("shipping_option_id");
        if (_object != null) {
            shipping_option_id = _object.getAsString();
        }
        _object = object.get("order_info");
        if (_object != null) {
            order_info = new OrderInfo();
            order_info.ImportObject(_object.getAsJsonObject());
        }

        telegram_payment_charge_id = object.get("telegram_payment_charge_id").getAsString();
        provider_payment_charge_id = object.get("provider_payment_charge_id").getAsString();
    }
}
