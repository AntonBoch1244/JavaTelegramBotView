package ru.antonalekseevich.JavaTelegramBotView.ViewListeners.Buttons;

import ru.antonalekseevich.JavaTelegramBotView.BotView;
import ru.antonalekseevich.JavaTelegramBotView.ClientManager;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request_getMe;
import ru.antonalekseevich.JavaTelegramBotView.LockedStates;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetMe_ActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ClientManager.queue.push(new Request_getMe());
        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignore) {}
        } while (LockedStates.LOCKED);
        BotView.MainWindow.setTitle(ClientManager.cache.peek().getAsJsonObject().get("result").getAsJsonObject().get("username").getAsString());
    }
}
