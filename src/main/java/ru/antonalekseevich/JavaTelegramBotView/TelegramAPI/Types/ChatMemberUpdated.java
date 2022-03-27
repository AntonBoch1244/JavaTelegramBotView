package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class ChatMemberUpdated implements TelegramType {

    Chat chat;
    User from;
    int date;
    ChatMember old_chat_member;
    ChatMember new_chat_member;
    ChatInviteLink invite_link;

    @Override
    public void ImportObject(JsonObject object) {

    }
}
