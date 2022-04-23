package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class VideoChatParticipantsInvited extends TelegramType {

    User[] users;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
