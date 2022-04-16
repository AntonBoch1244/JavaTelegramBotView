package ru.antonalekseevich.JavaTelegramBotView;

import com.google.gson.JsonParser;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request.TelegramRequest;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.EmptyStackException;
import java.util.Stack;

public class ClientManager implements Runnable {

    public static HttpClient client = HttpClient.newHttpClient();

    public static Stack<RequestSendMethod> queue;
    public static Stack<TelegramRequest> results;

    public static void EmptyQueueAndResults() {
        queue = new Stack<>();
        results = new Stack<>();
    }

    @Override
    public void run() {
        while (true) {
            try {
                RequestSendMethod request = queue.pop();
                Main.LogManager.log(System.Logger.Level.INFO, "Processing request: " + request);
                HttpResponse<String> reply_message = client.send(request.Request, request.Reply);

                switch (reply_message.statusCode()) {
                    case 404 -> Main.LogManager.log(System.Logger.Level.ERROR, "Incorrect token/method not available.");
                    case 409 -> Main.LogManager.log(System.Logger.Level.INFO, "Too many requests.");
                    default -> {
                        Main.LogManager.log(System.Logger.Level.INFO, "Received code: " + reply_message.statusCode());
                        request.parse(JsonParser.parseString(reply_message.body()).getAsJsonObject());
                        ((TelegramRequest) request).ExtractTelegramType();
                        results.push((TelegramRequest) request);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | EmptyStackException ignore) {} catch (IOException | InterruptedException e) {
                Main.LogManager.log(System.Logger.Level.ERROR, "Sending failed: ".concat(e.getLocalizedMessage()));
            }
        }
    }
}
