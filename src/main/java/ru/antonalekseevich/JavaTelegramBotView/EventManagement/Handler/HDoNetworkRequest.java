package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler;

import com.google.gson.JsonParser;
import ru.antonalekseevich.JavaTelegramBotView.Main;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Request.TelegramRequest;

import java.io.IOException;
import java.net.http.HttpResponse;

public class HDoNetworkRequest extends Handler {
    @Override
    public void handle() {
        TelegramRequest request = (TelegramRequest) event.getContainer().getResult();
        try {
            HttpResponse<String> reply_message = Main.WebClient.send(request.Request, request.Reply);
            request.parse(JsonParser.parseString(reply_message.body()).getAsJsonObject());
            request.extractTelegramType();
            event.getContainer().setResult(request);
        } catch (IllegalAccessException | IOException | InterruptedException ignored) {}
    }
}
