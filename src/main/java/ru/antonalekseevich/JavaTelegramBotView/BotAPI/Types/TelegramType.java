package ru.antonalekseevich.JavaTelegramBotView.BotAPI.Types;

import java.lang.reflect.Field;

public abstract class TelegramType {

    public String toStringHelper(TelegramType this_class) {
        String name = this_class.getClass().getSimpleName();
        Field[] fields = this_class.getClass().getDeclaredFields();
        boolean first = true;
        StringBuilder sb = new StringBuilder(name);
        sb.append("{");
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                Object res_obj = field.get(this_class);
                if (res_obj != null) {
                    if (!first) sb.append(", ");
                    else first = false;
                    sb.append(field.getName());
                    sb.append("=");
                    sb.append(res_obj);
                }
            } catch (IllegalAccessException ignore) {}
        }
        sb.append("}");
        return sb.toString();
    }
}
