package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request;

import com.google.gson.JsonElement;
import ru.antonalekseevich.JavaTelegramBotView.LockedStates;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.API_REQUEST;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;

public class getMe extends RequestSendMethod implements API_REQUEST {
    @Override
    public void send() {
        LockedStates.LOCKED = true;
        send("getMe", true, (JsonElement) null);
        LockedStates.LOCKED = false;
    }
}
