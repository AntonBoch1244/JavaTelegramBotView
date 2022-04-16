package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ProximityAlertTrigger implements TelegramType {

    User traveler;
    User watcher;
    int distance;

    @Override
    public void ImportObject(JsonObject object) {
        traveler = new User();
        traveler.ImportObject(object.get("traveler").getAsJsonObject());
        watcher = new User();
        watcher.ImportObject(object.get("watcher").getAsJsonObject());
        distance = object.get("distance").getAsInt();
    }

    @Override
    public String toString() {
        String returnable = "ProximityAlertTrigger{";
        returnable += "traveler=" + traveler;
        returnable += ", watcher=" + watcher;
        returnable += ", distance=" + distance;
        returnable += "}";
        return returnable;
    }
}
