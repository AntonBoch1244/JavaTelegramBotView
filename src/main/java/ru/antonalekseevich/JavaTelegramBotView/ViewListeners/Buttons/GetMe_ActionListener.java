package ru.antonalekseevich.JavaTelegramBotView.ViewListeners.Buttons;

import ru.antonalekseevich.JavaTelegramBotView.BotView;
import ru.antonalekseevich.JavaTelegramBotView.ClientManager;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Request.getMe;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;

public class GetMe_ActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        RequestSendMethod getMe = new getMe(null);
        ClientManager.queue.push(getMe);
        while (true) {
            try {
                BotView.MainWindow.setTitle(((User) ((RequestSendMethod) ClientManager.results.pop()).Returnable).getUsername());
                break;
            } catch (EmptyStackException ignored) {}
        }

    }
}
