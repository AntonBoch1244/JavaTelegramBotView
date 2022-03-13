package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import ru.antonalekseevich.JavaTelegramBotView.ClientManager;
import ru.antonalekseevich.JavaTelegramBotView.LockedStates;
import ru.antonalekseevich.JavaTelegramBotView.Main;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class RequestSendMethod {

    public void send(String method_name, boolean cacheable, JsonElement... POST_Variables) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest message = HttpRequest.newBuilder(
                    new URI(
                            "https://api.telegram.org/bot"
                                    .concat(Main.BotViewProperties.get("api_token").toString())
                                    .concat("/").concat(method_name)
                    )
            ).build();
            HttpResponse.BodyHandler<String> reply = HttpResponse.BodyHandlers.ofString();
            Main.LogManager.log(System.Logger.Level.INFO, "Sending request ".concat(method_name).concat(" to Telegram server."));
            HttpResponse<String> reply_message = client.send(message, reply);
            switch (reply_message.statusCode()) {
                case 200 -> {
                    if (cacheable) ClientManager.cache.push(JsonParser.parseString(reply_message.body()));
                    else LockedStates.UPDATE = JsonParser.parseString(reply_message.body());
                }
                case 404 -> Main.LogManager.log(System.Logger.Level.ERROR, "Incorrect token/method not available.");
                case 409 -> Main.LogManager.log(System.Logger.Level.INFO, "Too many requests.");
                default -> Main.LogManager.log(System.Logger.Level.INFO, reply_message);
            }
        } catch (URISyntaxException ignored) {} catch (IOException | InterruptedException e) {
            Main.LogManager.log(System.Logger.Level.ERROR, "Sending failed: ".concat(e.getLocalizedMessage()));
        }
    }

}
