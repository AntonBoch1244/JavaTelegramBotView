package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Request;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import ru.antonalekseevich.JavaTelegramBotView.Main;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.Update;

import java.util.Stack;

public class GetUpdates extends TelegramRequest {
    public GetUpdates(JsonObject data) {
        super("getUpdates", "GET", data);
    }

    @Override
    public void extractTelegramType() {
        Returnable = new Stack<Update>();
        for (JsonElement ResultIterator : Result.getAsJsonArray()) {
            ((Stack<Update>)Returnable).push(Main.gson.fromJson(ResultIterator, Update.class));
        }
    }
}
