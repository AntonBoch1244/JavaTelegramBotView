package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class ChatInviteLink extends TelegramType {

    String invite_link;
    User creator;
    boolean creates_join_request;
    boolean is_primary;
    boolean is_revoked;
    String name;
    int expire_date;
    int member_limit;
    int pending_join_request_count;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
