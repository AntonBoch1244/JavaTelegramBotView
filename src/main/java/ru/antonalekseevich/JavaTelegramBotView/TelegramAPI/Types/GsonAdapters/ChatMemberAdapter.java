package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.GsonAdapters;

import com.google.gson.*;
import ru.antonalekseevich.JavaTelegramBotView.Main;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.*;

import java.lang.reflect.Type;

public class ChatMemberAdapter implements JsonDeserializer<ChatMember> {
    @Override
    public ChatMember deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return switch (((JsonObject) json).get("status").getAsString()) {
            case "creator" -> Main.gson.fromJson(json, ChatMemberOwner.class);
            case "administrator" -> Main.gson.fromJson(json, ChatMemberAdministrator.class);
            case "member" -> Main.gson.fromJson(json, ChatMemberMember.class);
            case "restricted" -> Main.gson.fromJson(json, ChatMemberRestricted.class);
            case "left" -> Main.gson.fromJson(json, ChatMemberLeft.class);
            case "kicked" -> Main.gson.fromJson(json, ChatMemberBanned.class);
            default -> null;
        };
    }
}
