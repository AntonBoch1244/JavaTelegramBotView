package ru.antonalekseevich.JavaTelegramBotView;

import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.API_REQUEST;

import java.util.EmptyStackException;
import java.util.Objects;

public class Requester implements Runnable {
    @Override
    public void run() {
        try {
            API_REQUEST request = ClientManager.queue.pop();
            while (LockedStates.LOCKED) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {
                    request = null;
                }
            }
            if (!Objects.equals(request, null)) request.send();
        } catch (EmptyStackException ignored) {
        }
    }
}
