package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class CallbackQuery implements TelegramType {

    String id;
    User from;
    Message message;
    String inline_message_id;
    String chat_instance;
    String data;
    String game_short_name;

    @Override
    public void ImportObject(JsonObject object) {
        id = object.get("id").getAsString();
        from = new User();
        from.ImportObject(object.get("from").getAsJsonObject());
        try {
            message = new Message();
            message.ImportObject(object.get("message").getAsJsonObject());
        } catch (Exception ignored) {}
        try {
            inline_message_id = object.get("inline_message_id").getAsString();
        } catch (Exception ignored) {}
        chat_instance = object.get("chat_instance").getAsString();
        try {
            data = object.get("data").getAsString();
        } catch (Exception ignored) {}
        try {
            game_short_name = object.get("game_short_name").getAsString();
        } catch (Exception ignored) {}
    }
}
