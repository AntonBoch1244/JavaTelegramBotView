package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonObject;

public class Poll implements TelegramType {

    String id;
    String question;
    PollOption[] options;
    int total_voter_count;
    boolean is_closed;
    boolean is_anonymous;
    String type;
    boolean allows_multiple_answers;
    int correct_option_id;
    String explanation;
    MessageEntity[] explanation_entities;
    int open_period;
    int close_date; // unix timestamp

    @Override
    public void ImportObject(JsonObject object) {

    }
}
