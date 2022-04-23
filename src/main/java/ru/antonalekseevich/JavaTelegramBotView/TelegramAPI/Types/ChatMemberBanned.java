package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class ChatMemberBanned extends ChatMember {

    int until_date;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
