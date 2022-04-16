package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request;

import com.google.gson.JsonObject;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.User;

public class getMe extends RequestSendMethod implements TelegramRequest {
    public getMe(JsonObject data) {
        super("getMe", "GET", data);
    }

    @Override
    public void ExtractTelegramType() {
        Returnable = new User();
        ((User) Returnable).ImportObject(Result.getAsJsonObject());
    }

    @Override
    public String toString() {
        try {
            return ((User) Returnable).toString();
        } catch (NullPointerException ignore) {
            return "getMe";
        }
    }
}
