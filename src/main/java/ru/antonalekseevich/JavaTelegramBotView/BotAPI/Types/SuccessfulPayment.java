package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class SuccessfulPayment extends TelegramType {

    String currency;
    int total_amount;
    String invoice_payload;
    String shipping_option_id;
    OrderInfo order_info;
    String telegram_payment_charge_id;
    String provider_payment_charge_id;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
