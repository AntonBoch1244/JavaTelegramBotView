package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class InputMediaDocument extends InputMedia {

    Object thumb; // InputFile versus String
    Boolean disable_content_type_detection;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
