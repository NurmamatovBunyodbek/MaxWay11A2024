package uz.bunyodbek;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

    private MyBotService myBotService = new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            if (text.equals("/start")) {

                try {
                    execute(myBotService.sendMessage(chatId));
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (text.equals("ShoxMed kartasi")) {
                try {
                    execute(myBotService.shohmedmenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();

            Integer messageId = callbackQuery.getMessage().getMessageId();

            if (data.equals("uzbekid")) {
                try {
                    execute(myBotService.mainMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("tafsilotId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.tafsilotMenu(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("tafsilotlarqaytishId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.shohmedmenuedit(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }


        }


    }

    @Override
    public String getBotUsername() {
        return "sinf11a2024Bot";
    }

    @Override
    public String getBotToken() {
        return "8031003687:AAGCrGHuaGRV45u9cMb3W2ZTVuV0J9P84hk";
    }
}
