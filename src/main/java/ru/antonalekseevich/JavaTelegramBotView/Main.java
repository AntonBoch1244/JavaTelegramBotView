package ru.antonalekseevich.JavaTelegramBotView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static Thread Manager;
    public static System.Logger LogManager = System.getLogger("BotView");
    public static Properties BotViewProperties = new Properties();
    public static String url;

    static void loadProperties() {
        try {
            LogManager.log(System.Logger.Level.INFO, "Try load file bot.properties.");
            BotViewProperties.load(new FileInputStream("bot.properties"));
        } catch (FileNotFoundException ignored) {
            LogManager.log(System.Logger.Level.INFO, "File not found. Setting default config.");

            // Window frame
            BotViewProperties.put("window_width", "1280");
            BotViewProperties.put("window_height", "720");

            // Token for server
            BotViewProperties.put("api_token", "REPLACE_WITH_YOUR_API_TOKEN");

            // Server connection
            BotViewProperties.put("other_server", "false");
            BotViewProperties.put("other_server_url", "");
            try {
                LogManager.log(System.Logger.Level.INFO, "Saving default config.");
                BotViewProperties.store(new FileOutputStream("bot.properties"), "Bot settings");
            } catch (IOException IOError) {
                LogManager.log(System.Logger.Level.ERROR, "Failed: ".concat(IOError.getLocalizedMessage()));
            }
        } catch (IOException IOError) {
            LogManager.log(System.Logger.Level.ERROR, "Failed: ".concat(IOError.getLocalizedMessage()));
        }
    }

    public static void main(String[] args) {
        loadProperties();
        if ((boolean) BotViewProperties.get("other_server"))
            if (!(BotViewProperties.get("other_server_url")).equals(""))
                url = BotViewProperties.get("other_server_url").toString().concat("/bot").concat(BotViewProperties.get("api_token").toString()).concat("/");
        else
            url = "https://api.telegram.org/bot".concat(BotViewProperties.get("api_token").toString()).concat("/");
        Manager = new Thread(new ClientManager(), "ClientManager");
        new BotView();
    }

}
