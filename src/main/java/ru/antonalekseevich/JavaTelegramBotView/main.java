package ru.antonalekseevich.JavaTelegramBotView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class main {

    public static Properties BotViewProperties = new Properties();

    static void loadProperties() {
        try {
            BotViewProperties.load(new FileInputStream("bot.properties"));
        } catch (FileNotFoundException filenotavailable) {
            BotViewProperties.put("window_width", "1280");
            BotViewProperties.put("window_height", "720");
            BotViewProperties.put("api_token", "HERE YOUR API_TOKEN");
            BotViewProperties.put("other_server", false);
            BotViewProperties.put("other_server_ip", "");
            BotViewProperties.put("other_server_port", "");
            try {
                BotViewProperties.store(new FileOutputStream("bot.properties"), "Bot settings");
            } catch (IOException ignored) {}
        } catch (IOException ignored) {}
    }

    public static void main(String[] args) {
        loadProperties();
        new BotView();
    }

}
