package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChatMemberMember extends ChatMember implements TelegramType {

    String status;
    User user;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
