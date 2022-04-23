package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class ChatJoinRequest extends TelegramType {

    Chat chat;
    User from;
    int date;
    String bio;
    ChatInviteLink invite_link;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
