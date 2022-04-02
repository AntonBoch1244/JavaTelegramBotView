package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChatMemberOwner extends ChatMember {

    String status;
    User user;
    boolean is_anonymous;
    String custom_title;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
