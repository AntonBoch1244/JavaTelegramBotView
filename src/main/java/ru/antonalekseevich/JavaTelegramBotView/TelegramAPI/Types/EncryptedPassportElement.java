package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class EncryptedPassportElement extends TelegramType {

    String type;
    String data;
    String phone_number;
    String email;
    PassportFile[] files;
    PassportFile front_side;
    PassportFile reverse_side;
    PassportFile selfie;
    PassportFile[] translation;
    String hash;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
