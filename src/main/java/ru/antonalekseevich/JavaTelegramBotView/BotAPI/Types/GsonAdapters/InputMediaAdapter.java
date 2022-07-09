package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.GsonAdapters;

import com.google.gson.*;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.*;
import ru.antonalekseevich.JavaTelegramBotView.Main;

import java.lang.reflect.Type;

public class InputMediaAdapter implements JsonDeserializer<InputMedia> {
    @Override
    public InputMedia deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return switch (((JsonObject) json).get("type").getAsString()) {
            case "photo" -> Main.gson.fromJson(json, InputMediaPhoto.class); // TODO: THUMBS IMPLEMENTATION
            case "video" -> Main.gson.fromJson(json, InputMediaVideo.class);
            case "animation" -> Main.gson.fromJson(json, InputMediaAnimation.class);
            case "audio" -> Main.gson.fromJson(json, InputMediaAudio.class);
            case "document" -> Main.gson.fromJson(json, InputMediaDocument.class);
            default -> null;
        };
    }
}
