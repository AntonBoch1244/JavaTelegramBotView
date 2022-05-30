package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class PollAnswer extends TelegramType {

    String poll_id;
    User user;
    int[] option_ids;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
