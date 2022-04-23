package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class Contact extends TelegramType {

    String phone_number;
    String first_name;
    String last_name;
    long user_id;
    String vcard;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
