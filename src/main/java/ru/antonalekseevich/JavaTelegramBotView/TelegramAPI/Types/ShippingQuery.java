package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class ShippingQuery extends TelegramType {

    String id;
    User from;
    String invoice_payload;
    ShippingAddress shipping_address;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
