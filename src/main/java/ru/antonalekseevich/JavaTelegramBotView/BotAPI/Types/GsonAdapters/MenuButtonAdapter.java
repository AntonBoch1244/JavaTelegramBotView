package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.GsonAdapters;

import com.google.gson.*;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.MenuButton;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.MenuButtonCommands;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.MenuButtonDefault;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.MenuButtonWebApp;
import ru.antonalekseevich.JavaTelegramBotView.Main;

import java.lang.reflect.Type;

public class MenuButtonAdapter implements JsonDeserializer<MenuButton> {
    @Override
    public MenuButton deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return switch (((JsonObject) json).get("type").getAsString()) {
            case "commands" -> Main.gson.fromJson(json, MenuButtonCommands.class);
            case "web_app" -> Main.gson.fromJson(json, MenuButtonWebApp.class);
            case "default" -> Main.gson.fromJson(json, MenuButtonDefault.class);
            default -> null;
        };
    }
}
