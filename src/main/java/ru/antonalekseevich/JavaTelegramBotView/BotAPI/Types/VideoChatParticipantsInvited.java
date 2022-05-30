package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class VideoChatParticipantsInvited extends TelegramType {

    User[] users;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
