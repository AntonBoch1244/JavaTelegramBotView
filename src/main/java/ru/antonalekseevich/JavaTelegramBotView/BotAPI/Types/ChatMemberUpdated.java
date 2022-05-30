package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ChatMemberUpdated extends TelegramType {

    Chat chat;
    User from;
    int date;
    ChatMember old_chat_member;
    ChatMember new_chat_member;
    ChatInviteLink invite_link;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
