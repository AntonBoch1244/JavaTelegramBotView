package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class Dice extends TelegramType {

    String emoji;
    byte value;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
