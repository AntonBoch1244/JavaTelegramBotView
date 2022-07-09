package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class InputMediaAudio extends InputMedia {
    Object thumb; // InputFile versus String
    Integer duration;
    String performer;
    String title;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
