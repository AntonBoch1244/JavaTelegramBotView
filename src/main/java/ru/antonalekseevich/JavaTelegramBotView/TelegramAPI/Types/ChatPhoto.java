package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChatPhoto implements TelegramType {

    // Small files
    String small_file_id;
    String small_file_unique_id;

    // Big files
    String big_file_id;
    String big_file_unique_id;

    @Override
    public void ImportObject(JsonObject object) {
        small_file_id = object.get("small_file_id").getAsString();
        small_file_unique_id = object.get("small_file_unique_id").getAsString();
        big_file_id = object.get("big_file_id").getAsString();
        big_file_unique_id = object.get("big_file_unique_id").getAsString();
    }
}
