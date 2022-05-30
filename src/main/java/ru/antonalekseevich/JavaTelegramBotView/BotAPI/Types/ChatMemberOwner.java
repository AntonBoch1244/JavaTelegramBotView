package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class ChatMemberOwner extends ChatMember {

    boolean is_anonymous;
    String custom_title;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
