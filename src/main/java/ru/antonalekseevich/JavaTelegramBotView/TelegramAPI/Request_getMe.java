package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI;

import com.google.gson.JsonParser;
import ru.antonalekseevich.JavaTelegramBotView.ClientManager;
import ru.antonalekseevich.JavaTelegramBotView.Main;
import ru.antonalekseevich.JavaTelegramBotView.LockedStates;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request_getMe implements API_REQUEST {
    @Override
    public void send() {
        LockedStates.LOCKED = true;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest message = HttpRequest.newBuilder(
                    new URI(
                            "https://api.telegram.org/bot"
                                    .concat(Main.BotViewProperties.get("api_token").toString())
                                    .concat("/getMe")
                    )
            ).build();
            HttpResponse.BodyHandler<String> reply = HttpResponse.BodyHandlers.ofString();
            Main.LogManager.log(System.Logger.Level.INFO, "Sending request getMe to Telegram server.");
            HttpResponse<String> reply_message = client.send(message, reply);
            switch (reply_message.statusCode()) {
                case 404 -> Main.LogManager.log(System.Logger.Level.ERROR, "Incorrect token.");
                case 200 -> ClientManager.cache.push(JsonParser.parseString(reply_message.body()));
                default -> Main.LogManager.log(System.Logger.Level.INFO, reply_message);
            }
        } catch (URISyntaxException ignored) {} catch (IOException | InterruptedException e) {
            Main.LogManager.log(System.Logger.Level.ERROR, "Sending failed: ".concat(e.getLocalizedMessage()));
        }
        LockedStates.LOCKED = false;
    }
}
