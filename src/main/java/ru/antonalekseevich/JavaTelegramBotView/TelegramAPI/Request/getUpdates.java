package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.Update;

import java.util.Stack;

public class getUpdates extends RequestSendMethod implements TelegramRequest {
    public getUpdates(JsonObject data) {
        super("getUpdates", "GET", data);
    }

    @Override
    public void ExtractTelegramType() {
        Update returnable;
        Returnable = new Stack<Update>();
        for (JsonElement ResultIterator : Result.getAsJsonArray()) {
            returnable = new Update();
            returnable.ImportObject(ResultIterator.getAsJsonObject());
            ((Stack<Update>)Returnable).push(returnable);
        }
    }

    @Override
    public String toString() {
        try {
            return ((Stack<Update>) Returnable).toString();
        } catch (NullPointerException ignore) {
            return "getUpdates";
        }
    }
}
