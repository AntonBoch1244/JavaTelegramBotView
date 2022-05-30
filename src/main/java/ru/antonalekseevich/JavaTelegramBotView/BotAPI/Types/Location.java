package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class Location extends TelegramType {

    float longitude;
    float latitude;
    Float horizontal_accuracy;
    Integer live_period;
    Integer heading;
    Integer proximity_alert_radius;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
