package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class Sticker extends TelegramType {

    String file_id;
    String file_unique_id;
    int width;
    int height;
    boolean is_animated;
    boolean is_video;
    PhotoSize thumb;
    String emoji;
    String set_name;
    MaskPosition mask_position;
    Integer file_size;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
