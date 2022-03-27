package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChatJoinRequest implements TelegramType {

    Chat chat;
    User from;
    int date;
    String bio;
    ChatInviteLink invite_link;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
