package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChatMemberBanned extends ChatMember implements TelegramType {

    String status;
    User user;
    int until_date;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
