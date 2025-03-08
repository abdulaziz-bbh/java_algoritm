package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot  extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
if (update.hasMessage() && update.getMessage().getText().equals("/start")){
    Long chatId = update.getMessage().getChatId();
send(chatId,"Assalomu aleykom");
}
    }


public void send(Long chatId,String text){
    SendMessage sendMessage = new SendMessage();
    sendMessage.setChatId(chatId);
    sendMessage.setText(text);
    try {
        execute(sendMessage);
    } catch (TelegramApiException e) {
        throw new RuntimeException(e);
    }
}




    @Override
    public String getBotUsername() {
        return "gulyamov_bot";
    }

    @Override
    public String getBotToken() {
        return "7710754391:AAH8QtS8-bddm7vvvgxOTmJbCIih3OrndXs";
    }
}
