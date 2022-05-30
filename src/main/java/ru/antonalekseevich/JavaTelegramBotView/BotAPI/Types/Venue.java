package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class Venue extends TelegramType {

    Location location;
    String title;
    String address;
    String foursquare_id;
    String foursquare_type;
    String google_place_id;
    String google_place_type;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
