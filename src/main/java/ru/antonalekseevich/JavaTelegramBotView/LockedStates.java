package ru.antonalekseevich.JavaTelegramBotView;

import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Reply.ServerReply;

public class LockedStates {

    // Locking state
    public static boolean LOCKED = false;

    // Last update
    public static ServerReply UPDATE;

    // For cache cleaning
    public static boolean CacheLocked = false;

}
