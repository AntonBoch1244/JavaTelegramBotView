package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import ru.antonalekseevich.JavaTelegramBotView.Main;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.Update;

import java.util.Stack;

public class getUpdates extends RequestSendMethod implements TelegramRequest {
    public getUpdates(JsonObject data) {
        super("getUpdates", "GET", data);
    }

    @Override
    public void ExtractTelegramType() {
        Returnable = new Stack<Update>();
        for (JsonElement ResultIterator : Result.getAsJsonArray()) {
            ((Stack<Update>)Returnable).push(Main.gson.fromJson(ResultIterator, Update.class));
        }
    }
}
