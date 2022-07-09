package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class InputMediaVideo extends InputMedia {

    Object thumb; // InputFile versus String
    Integer width;
    Integer height;
    Integer duration;
    Boolean supports_streaming;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
