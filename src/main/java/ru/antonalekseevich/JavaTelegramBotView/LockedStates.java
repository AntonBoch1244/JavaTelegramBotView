package ru.antonalekseevich.JavaTelegramBotView;

import com.google.gson.JsonElement;

public class LockedStates {

    // Locking state
    public static boolean LOCKED = false;

    // Last update
    public static JsonElement UPDATE;

    // For cache cleaning
    public static boolean CacheLocked = false;

}
