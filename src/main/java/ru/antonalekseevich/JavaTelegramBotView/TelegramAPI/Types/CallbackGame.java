package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class CallbackGame implements TelegramType {

    int user_id;
    int score;
    Boolean force;
    Boolean disable_edit_message;
    Integer chat_id;
    Integer message_id;
    String inline_message_id;

    @Override
    public void ImportObject(JsonObject object) {
        user_id = object.get("user_id").getAsInt();
        score = object.get("score").getAsInt();
        JsonElement _object = object.get("force");
        if (_object != null) {
            force = _object.getAsBoolean();
        }
        _object = object.get("disable_edit_message");
        if (_object != null) {
            disable_edit_message = _object.getAsBoolean();
        }
        _object = object.get("chat_id");
        if (_object != null) {
            chat_id = _object.getAsInt();
        }
        _object = object.get("message_id");
        if (_object != null) {
            message_id = _object.getAsInt();
        }
        _object = object.get("inline_message_id");
        if (_object != null) {
            inline_message_id = _object.getAsString();
        }


    }

    @Override
    public String toString() {
        String returnable = "CallbackGame{";
        returnable += ", user_id=" + user_id;
        returnable += ", score=" + score;
        if (force != null) returnable += ", force=" + force;
        if (disable_edit_message != null) returnable += ", disable_edit_message=" + disable_edit_message;
        if (chat_id != null) returnable += ", chat_id=" + chat_id;
        if (message_id != null) returnable += ", message_id=" + message_id;
        if (inline_message_id != null) returnable += ", inline_message_id=" + inline_message_id;
        returnable += "}";
        return returnable;
    }
}
