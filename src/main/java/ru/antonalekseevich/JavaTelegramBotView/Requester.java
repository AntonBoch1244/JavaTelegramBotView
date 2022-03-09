package ru.antonalekseevich.JavaTelegramBotView;

import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.API_REQUEST;

import java.util.EmptyStackException;

public class Requester implements Runnable {
    @Override
    public void run() {
        try {
            API_REQUEST request = ClientManager.queue.pop();
            request.send();
        } catch (EmptyStackException ignored) {
        }
    }
}
