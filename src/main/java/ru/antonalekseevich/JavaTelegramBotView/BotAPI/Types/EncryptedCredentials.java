package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

public class EncryptedCredentials extends TelegramType {

    String data;
    String hash;
    String secret;

    @Override
    public String toString() {
        return toStringHelper(this);
    }
}
