package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class Dice extends TelegramType {

    String emoji;
    byte value;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
