package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request;

import com.google.gson.JsonElement;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.API_REQUEST;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;

public class getUpdates extends RequestSendMethod implements API_REQUEST {
    @Override
    public void send() {
        send("getUpdates", false, (JsonElement) null);
    }
}
