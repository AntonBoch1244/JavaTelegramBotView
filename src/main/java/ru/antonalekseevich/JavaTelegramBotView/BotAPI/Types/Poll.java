package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class Poll extends TelegramType {

    String id;
    String question;
    PollOption[] options;
    int total_voter_count;
    boolean is_closed;
    boolean is_anonymous;
    String type;
    boolean allows_multiple_answers;
    Integer correct_option_id;
    String explanation;
    MessageEntity[] explanation_entities;
    Integer open_period;
    Integer close_date;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
