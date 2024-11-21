package uz.bunyodbek;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {

    public SendMessage sendMessage(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Shox Med ga xush kelibsiz");
        return sendMessage;
    }

    public SendMessage menu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Rus tili");
        button.setCallbackData("rusId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("O'zbek tili");
        button.setCallbackData("uzbekid");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("English");
        button.setCallbackData("englishid");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }


    public SendMessage mainMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("ShoxMed kartasi");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }

    public SendMessage shohmedmenu(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Marhamat!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Tafsilotlar");
        button.setCallbackData("tafsilotId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();

        button.setText("Elektron karta");
        button.setCallbackData("elektronId");
        row.add(button);
        rowList.add(row);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();

        button.setText("qaytish");
        button.setCallbackData("qaytishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }

    public InlineKeyboardMarkup shohmedmenuedit(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Marhamat!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Tafsilotlar");
        button.setCallbackData("tafsilotId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();

        button.setText("Elektron karta");
        button.setCallbackData("elektronId");
        row.add(button);
        rowList.add(row);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();

        button.setText("qaytish");
        button.setCallbackData("qaytishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;

    }

    public InlineKeyboardMarkup tafsilotMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Marhamat!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Elektron kartani tiklash");
        button.setCallbackData("kartatiklashId");
        row.add(button);
        rowList.add(row);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();

        button.setText("Qoidalar");
        button.setCallbackData("qoidalarid");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish");
        button.setCallbackData("tafsilotlarqaytishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


}
