package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.GsonAdapters;

import com.google.gson.*;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.*;
import ru.antonalekseevich.JavaTelegramBotView.Main;

import java.lang.reflect.Type;

public class BotCommandScopeAdapter implements JsonDeserializer<BotCommandScope> {
    @Override
    public BotCommandScope deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return switch (((JsonObject) json).get("type").getAsString()) {
            case "default" -> Main.gson.fromJson(json, BotCommandScopeDefault.class);
            case "all_private_chats" -> Main.gson.fromJson(json, BotCommandScopeAllPrivateChats.class);
            case "all_group_chats" -> Main.gson.fromJson(json, BotCommandScopeAllGroupChats.class);
            case "all_chat_administrators" -> Main.gson.fromJson(json, BotCommandScopeAllChatAdministrators.class);
            case "chat" -> Main.gson.fromJson(json, BotCommandScopeChat.class); // TODO: IMPLEMENT INT | STRING FOR NEXT THREE METHODS
            case "chat_administrators" -> Main.gson.fromJson(json, BotCommandScopeChatAdministrators.class);
            case "chat_member" -> Main.gson.fromJson(json, BotCommandScopeChatMember.class);
            default -> null;
        };
    }
}
