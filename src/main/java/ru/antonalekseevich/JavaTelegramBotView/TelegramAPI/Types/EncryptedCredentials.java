package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class EncryptedCredentials implements TelegramType {

    String data;
    String hash;
    String secret;

    @Override
    public void ImportObject(JsonObject object) {
        data = object.get(data).getAsString();
        hash = object.get(hash).getAsString();
        secret = object.get(secret).getAsString();
    }

    @Override
    public String toString() {
        String returnable = "EncryptedCredentials{";
        returnable += "data=" + data;
        returnable += ", hash=" + hash;
        returnable += ", secret=" + secret;
        returnable += "}";
        return returnable;
    }
}
