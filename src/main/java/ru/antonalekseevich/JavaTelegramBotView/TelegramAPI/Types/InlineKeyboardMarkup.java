package ru.antonalekseevich.JavaTelegramBotView.TelegramAPI.Types;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class InlineKeyboardMarkup implements TelegramType {

    InlineKeyboardButton[][] inline_keyboard;

    @Override
    public void ImportObject(JsonObject object) {
        JsonArray _object_array = object.get("inline_keyboard").getAsJsonArray();
        inline_keyboard = new InlineKeyboardButton[_object_array.size()][];
        for (int row=0; row < _object_array.size(); row++) {
            JsonArray _row_array = _object_array.get(row).getAsJsonArray();
            InlineKeyboardButton[] _row = new InlineKeyboardButton[_row_array.size()];
            for (int column=0; column < _row_array.size(); column++) {
                InlineKeyboardButton _column = new InlineKeyboardButton();
                _column.ImportObject(_row_array.get(column).getAsJsonObject());
                _row[column] = _column;
            }
            inline_keyboard[row] = _row;
        }
    }
}
