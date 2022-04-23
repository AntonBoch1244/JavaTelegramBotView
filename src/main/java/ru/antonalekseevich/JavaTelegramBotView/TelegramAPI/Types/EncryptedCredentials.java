package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

public class EncryptedCredentials extends TelegramType {

    String data;
    String hash;
    String secret;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
