package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Reply;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types.TelegramType;

public class ServerReply {

    public boolean Reply_Ok;
    public TelegramType Reply_Result;

    public ServerReply(String Reply, TelegramType ReplyBody) {
        Parse(JsonParser.parseString(Reply), ReplyBody);
    }

    public void Parse(JsonElement Reply, TelegramType ReplyBody) {
        Reply_Ok = Reply.getAsJsonObject().get("ok").getAsBoolean();
        ReplyBody.ImportObject(Reply.getAsJsonObject().get("result").getAsJsonObject());
        Reply_Result = ReplyBody;
    }

    @Override
    public String toString() {
        return Reply_Result.toString();
    }
}
