package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class PassportData implements TelegramType {

    EncryptedPassportElement[] data;
    EncryptedCredentials credentials;

    @Override
    public void ImportObject(JsonObject object) {
        JsonArray _object_array = object.get("data").getAsJsonArray();
        data = new EncryptedPassportElement[_object_array.size()];
        for (int item = 0; item < data.length; item++) {
            EncryptedPassportElement _data = new EncryptedPassportElement();
            _data.ImportObject(_object_array.get(item).getAsJsonObject());
            data[item] = _data;
        }
        credentials = new EncryptedCredentials();
        credentials.ImportObject(object.get("credentials").getAsJsonObject());
    }
}
