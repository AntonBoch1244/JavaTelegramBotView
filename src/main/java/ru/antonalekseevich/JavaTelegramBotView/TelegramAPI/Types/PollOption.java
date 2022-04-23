package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class PollOption extends TelegramType {

    String text;
    int voter_count;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
