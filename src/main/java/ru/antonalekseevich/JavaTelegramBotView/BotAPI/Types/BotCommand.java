package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class BotCommand extends TelegramType {

    String command;
    String description;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
