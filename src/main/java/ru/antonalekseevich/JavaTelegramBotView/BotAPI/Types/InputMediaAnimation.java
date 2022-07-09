package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class InputMediaAnimation extends InputMedia {

    Object thumb; // InputFile versus String

    Integer width;
    Integer height;
    Integer duration;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
