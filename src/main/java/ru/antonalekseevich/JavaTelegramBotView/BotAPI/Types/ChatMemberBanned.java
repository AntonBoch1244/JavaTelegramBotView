package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ChatMemberBanned extends ChatMember {

    int until_date;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
