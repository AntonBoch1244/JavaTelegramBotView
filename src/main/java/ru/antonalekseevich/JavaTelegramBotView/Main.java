package ru.antonalekseevich.JavaTelegramBotView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.ChatMember;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.GsonAdapters.BotCommandScopeAdapter;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.GsonAdapters.ChatMemberAdapter;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.GsonAdapters.InputMediaAdapter;
import ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types.GsonAdapters.MenuButtonAdapter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Properties;

public class Main {

    public static Gson gson;
    public static HttpClient WebClient = HttpClient.newHttpClient();
    public static final System.Logger LogManager = System.getLogger("BotView");
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
            BotViewProperties.put("other_server", "\"false\"");
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

    public static void reloadURL() {
        if (Boolean.parseBoolean(BotViewProperties.get("other_server").toString()))
            if (!(BotViewProperties.get("other_server_url")).equals("")) {
                LogManager.log(System.Logger.Level.INFO, "Using other Telegram server.");
                url = BotViewProperties.get("other_server_url").toString().concat("/bot").concat(BotViewProperties.get("api_token").toString()).concat("/");
            } else {
                LogManager.log(System.Logger.Level.INFO, "Property other_server_url is empty, considering use of official Telegram servers.");
                url = "https://api.telegram.org/bot".concat(BotViewProperties.get("api_token").toString()).concat("/");
            } else {
            LogManager.log(System.Logger.Level.INFO, "Using official Telegram server.");
            url = "https://api.telegram.org/bot".concat(BotViewProperties.get("api_token").toString()).concat("/");
        }
    }

    public static void main(String[] args) {
        loadProperties();
        reloadURL();
        gson = new GsonBuilder()
                .registerTypeAdapter(BotCommandScopeAdapter.class, new BotCommandScopeAdapter())
                .registerTypeAdapter(ChatMember.class, new ChatMemberAdapter())
                .registerTypeAdapter(InputMediaAdapter.class, new InputMediaAdapter())
                .registerTypeAdapter(MenuButtonAdapter.class, new MenuButtonAdapter())
                .create();
        new BotView();
    }

}
