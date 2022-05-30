package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class PollOption extends TelegramType {

    String text;
    int voter_count;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
