package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request;

import com.google.gson.JsonObject;
import ru.antonalekseevich.JavaTelegramBotView.Main;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.User;

public class getMe extends RequestSendMethod implements TelegramRequest {
    public getMe(JsonObject data) {
        super("getMe", "GET", data);
    }

    @Override
    public void ExtractTelegramType() {
        Returnable = Main.gson.fromJson(Result.getAsJsonObject(), User.class);
    }
}
