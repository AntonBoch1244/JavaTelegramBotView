package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ProximityAlertTrigger extends TelegramType {

    User traveler;
    User watcher;
    int distance;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
