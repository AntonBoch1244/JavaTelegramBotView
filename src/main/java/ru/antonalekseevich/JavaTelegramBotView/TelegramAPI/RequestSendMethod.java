package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import ru.antonalekseevich.JavaTelegramBotView.Main;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.TelegramType;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class RequestSendMethod {

    public HttpRequest Request;
    public HttpResponse.BodyHandler<String> Reply;
    public JsonElement Result;
    public Object Returnable;

    protected RequestSendMethod(String name, String http_method, JsonObject data) {
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder();
        HttpRequest.BodyPublisher request_data = HttpRequest.BodyPublishers.ofString(String.valueOf(data));

        requestBuilder.uri(URI.create(Main.url.concat(name)));

        requestBuilder.header("Content-Type", "application/json");
        requestBuilder.method(http_method, request_data);

        Request = requestBuilder.build();
        Reply = HttpResponse.BodyHandlers.ofString();
    }

    public void parse(JsonObject reply_message) {
        if (reply_message.get("ok").getAsBoolean()) {
            Result = reply_message.get("result");
        }
    }
}
