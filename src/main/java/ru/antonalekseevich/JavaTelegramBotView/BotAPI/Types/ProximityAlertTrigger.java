package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ProximityAlertTrigger extends TelegramType {

    User traveler;
    User watcher;
    int distance;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
