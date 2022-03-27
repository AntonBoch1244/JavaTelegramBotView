package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request;

import com.google.gson.JsonElement;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.API_REQUEST;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.Update;

public class getUpdates extends RequestSendMethod implements API_REQUEST {
    @Override
    public void send() {
        send("getUpdates", false, new Update(), (JsonElement) null);
    }
}
