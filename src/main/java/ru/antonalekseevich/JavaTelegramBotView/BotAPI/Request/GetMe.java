package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Request;

import com.google.gson.JsonObject;
import ru.antonalekseevich.JavaTelegramBotView.Main;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.User;

public class GetMe extends TelegramRequest {
    public GetMe(JsonObject data) {
        super("getMe", "GET", data);
    }

    @Override
    public void extractTelegramType() {
        Returnable = Main.gson.fromJson(Result.getAsJsonObject(), User.class);
    }
}
