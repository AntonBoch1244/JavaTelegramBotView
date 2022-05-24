package ru.antonalekseevich.JavaTelegramBotView.EventManagement.Handler;

import ru.antonalekseevich.JavaTelegramBotView.BotView;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.RequestSendMethod;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.User;

public class HSetWindowTitle extends Handler {
    @Override
    public void handle() {
        BotView.MainWindow.setTitle(((User)((RequestSendMethod)event.getContainer().getResult()).Returnable).username);
    }
}
