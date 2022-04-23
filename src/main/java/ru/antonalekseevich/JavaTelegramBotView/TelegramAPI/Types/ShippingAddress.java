package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class ShippingAddress extends TelegramType {

    String country_code;
    String state;
    String city;
    String street_line1;
    String street_line2;
    String post_code;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
