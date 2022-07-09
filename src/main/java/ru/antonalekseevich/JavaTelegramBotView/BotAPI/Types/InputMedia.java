package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public abstract class InputMedia extends TelegramType {

    String type;
    String media;
    String caption;
    String parse_mode;
    MessageEntity[] caption_entities;
}
