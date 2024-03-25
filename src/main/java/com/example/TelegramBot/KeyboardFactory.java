package com.example.TelegramBot;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.List;

public class KeyboardFactory {
    public static ReplyKeyboard getPizzaToppingsKeyboard() {
        KeyboardRow row = new KeyboardRow();
        row.add("瑪格麗塔");
        row.add("義大利辣腸");
        return new ReplyKeyboardMarkup(List.of(row));
    }

    public static ReplyKeyboard getPizzaOrDrinkKeyboard(){
        KeyboardRow row = new KeyboardRow();
        row.add("Pizza");
        row.add("飲料");
        return new ReplyKeyboardMarkup(List.of(row));
    }

    public static ReplyKeyboard getYesOrNo() {
        KeyboardRow row = new KeyboardRow();
        row.add("Yes");
        row.add("No");
        return new ReplyKeyboardMarkup(List.of(row));
    }
}
