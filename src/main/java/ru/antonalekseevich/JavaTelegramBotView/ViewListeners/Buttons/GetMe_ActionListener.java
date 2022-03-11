package ru.antonalekseevich.JavaTelegramBotView.ViewListeners.Buttons;

import ru.antonalekseevich.JavaTelegramBotView.ClientManager;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request_getMe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetMe_ActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ClientManager.queue.push(new Request_getMe());
    }
}
