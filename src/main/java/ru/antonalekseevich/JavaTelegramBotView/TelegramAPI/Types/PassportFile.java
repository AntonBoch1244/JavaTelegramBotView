package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class PassportFile implements TelegramType {

    String file_id;
    String file_unique_id;
    int file_size;
    int file_date;

    @Override
    public void ImportObject(JsonObject object) {
        file_id = object.get("file_id").getAsString();
        file_unique_id = object.get("file_unique_id").getAsString();
        file_size = object.get("file_size").getAsInt();
        file_date = object.get("file_date").getAsInt();
    }

    @Override
    public String toString() {
        String returnable = "PassportFile{";
        returnable += "file_id=" + file_id;
        returnable += ", file_unique_id=" + file_unique_id;
        returnable += ", file_size=" + file_size;
        returnable += ", file_date=" + file_date;
        returnable += "}";
        return returnable;
    }
}
