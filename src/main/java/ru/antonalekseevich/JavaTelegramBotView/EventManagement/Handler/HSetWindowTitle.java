package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler;

import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Request.TelegramRequest;
import ru.antonalekseevich.JavaTelegramBotView.BotView;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.User;

public class HSetWindowTitle extends Handler {
    @Override
    public void handle() {
        TelegramRequest request = (TelegramRequest) event.getContainer().getResult();
        User user = (User) request.Returnable;
        String username = user.username;
        BotView.MainWindow.setTitle(username);
    }
}
