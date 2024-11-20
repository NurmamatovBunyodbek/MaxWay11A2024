package uz.bunyodbek;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {

    public SendMessage sendMessage(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" Shox Med ga xush kelibsiz");
        return sendMessage;
    }

    public SendMessage menu(Long chatId){
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

        row= new ArrayList<>();
        button= new InlineKeyboardButton();
        button.setText("O'zbek tili");
        button.setCallbackData("uzbekid");
        row.add(button);
        rowList.add(row);

        row= new ArrayList<>();
        button= new InlineKeyboardButton();
        button.setText("English");
        button.setCallbackData("englishid");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;






    }




}
