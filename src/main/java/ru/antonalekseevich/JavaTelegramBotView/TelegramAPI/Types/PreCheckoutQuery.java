package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class PreCheckoutQuery extends TelegramType {

    String id;
    User from;
    String currency;
    int total_amount;
    String invoice_payload;
    String shipping_option_id;
    OrderInfo order_info;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
