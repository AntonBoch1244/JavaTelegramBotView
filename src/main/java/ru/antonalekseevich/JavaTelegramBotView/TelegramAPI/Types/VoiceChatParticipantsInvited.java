package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.Arrays;

public class VoiceChatParticipantsInvited implements TelegramType {

    User[] users;

    @Override
    public void ImportObject(JsonObject object) {
        JsonArray _object_array = object.get("users").getAsJsonArray();
        users = new User[_object_array.size()];
        for (int item=0; item < _object_array.size(); item++) {
            User user = new User();
            user.ImportObject(_object_array.get(item).getAsJsonObject());
            users[item] = user;
        }
    }

    @Override
    public String toString() {
        String returnable = "VoiceChatParticipantsInvited{";
        returnable += "users=" + Arrays.toString(users);
        returnable += "}";
        return returnable;
    }
}
