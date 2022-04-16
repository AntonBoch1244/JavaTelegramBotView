package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Arrays;

public class EncryptedPassportElement implements TelegramType {

    String type;
    String data;
    String phone_number;
    String email;
    PassportFile[] files;
    PassportFile front_side;
    PassportFile reverse_side;
    PassportFile selfie;
    PassportFile[] translation;
    String hash;

    @Override
    public void ImportObject(JsonObject object) {
        type = object.get("type").getAsString();
        JsonElement _object = object.get("data");
        if (_object != null) {
            data = _object.getAsString();
        }
        _object = object.get("phone_number");
        if (_object != null) {
            phone_number = _object.getAsString();
        }
        _object = object.get("email");
        if (_object != null) {
            email = _object.getAsString();
        }
        _object = object.get("files");
        if (_object != null) {
            JsonArray _object_array = _object.getAsJsonArray();
            files = new PassportFile[_object_array.size()];
            for (int item = 0; item<_object_array.size(); item++) {
                PassportFile file = new PassportFile();
                file.ImportObject(_object_array.get(item).getAsJsonObject());
                files[item] = file;
            }
        }
        _object = object.get("front_side");
        if (_object != null) {
            front_side = new PassportFile();
            front_side.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("reverse_side");
        if (_object != null) {
            reverse_side = new PassportFile();
            reverse_side.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("selfie");
        if (_object != null) {
            selfie = new PassportFile();
            selfie.ImportObject(_object.getAsJsonObject());
        }
        _object = object.get("translation");
        if (_object != null) {
            JsonArray _object_array = _object.getAsJsonArray();
            translation = new PassportFile[_object_array.size()];
            for (int item = 0; item<_object_array.size(); item++) {
                PassportFile file = new PassportFile();
                file.ImportObject(_object_array.get(item).getAsJsonObject());
                translation[item] = file;
            }
        }
        hash = object.get("hash").getAsString();
    }

    @Override
    public String toString() {
        String returnable = "EncryptedPassportElement{";
        returnable += "type=" + type;
        if (data != null)
            returnable += ", data=" + data;
        if (phone_number != null)
            returnable += ", phone_number=" + phone_number;
        if (email != null)
            returnable += ", email=" + email;
        if (files != null)
            returnable += ", files=" + Arrays.toString(files);
        if (front_side != null)
            returnable += ", front_side=" + front_side;
        if (reverse_side != null)
            returnable += ", reverse_side=" + reverse_side;
        if (selfie != null)
            returnable += ", selfie=" + selfie;
        if (translation != null)
            returnable += ", translation=" + Arrays.toString(translation);
        returnable += ", hash=" + hash;
        returnable += "}";
        return returnable;
    }
}
