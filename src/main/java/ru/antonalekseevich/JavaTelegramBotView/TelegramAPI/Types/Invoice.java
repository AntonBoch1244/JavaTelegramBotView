package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Invoice implements TelegramType {

    String title;
    String description;
    String start_parameter;
    String currency;
    int total_amount;

    @Override
    public void ImportObject(JsonObject object) {
        title = object.get("title").getAsString();
        description = object.get("description").getAsString();
        start_parameter = object.get("start_parameter").getAsString();
        currency = object.get("currency").getAsString();
        total_amount = object.get("total_amount").getAsInt();
    }

    @Override
    public String toString() {
        String returnable = "Invoice{";
        returnable += "title=" + title;
        returnable += ", description=" + description;
        returnable += ", start_parameter=" + start_parameter;
        returnable += ", currency=" + currency;
        returnable += ", total_amount=" + total_amount;
        returnable += "}";
        return returnable;
    }
}
