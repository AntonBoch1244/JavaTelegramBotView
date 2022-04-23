package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class PassportData extends TelegramType {

    EncryptedPassportElement[] data;
    EncryptedCredentials credentials;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
