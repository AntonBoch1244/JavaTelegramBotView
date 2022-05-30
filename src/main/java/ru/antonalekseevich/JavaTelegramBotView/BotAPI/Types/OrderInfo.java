package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class OrderInfo extends TelegramType {

    String name;
    String phone_number;
    String email;
    ShippingAddress shipping_address;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
