package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class Game extends TelegramType {

    String title;
    String description;
    PhotoSize[] photo;
    String text;
    MessageEntity[] text_entities;
    Animation animation;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
