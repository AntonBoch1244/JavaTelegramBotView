package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler;

import com.google.gson.JsonParser;
import ru.antonalekseevich.JavaTelegramBotView.Main;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request.TelegramRequest;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;

import java.io.IOException;
import java.net.http.HttpResponse;

public class HDoNetworkRequest extends Handler {
    @Override
    public void handle() {
        RequestSendMethod request = (RequestSendMethod)event.getContainer().getResult();
        try {
            HttpResponse<String> reply_message = Main.WebClient.send(request.Request, request.Reply);
            request.parse(JsonParser.parseString(reply_message.body()).getAsJsonObject());
            ((TelegramRequest) request).ExtractTelegramType();
            event.getContainer().setResult(request);
        } catch (IllegalAccessException | IOException | InterruptedException ignored) {}
    }
}
