package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class Invoice extends TelegramType {

    String title;
    String description;
    String start_parameter;
    String currency;
    int total_amount;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
