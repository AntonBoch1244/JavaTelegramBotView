package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class MaskPosition extends TelegramType {

    String point;
    float x_shift;
    float y_shift;
    float scale;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
