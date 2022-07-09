package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class KeyboardButtonPollType extends TelegramType {

    String type;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
