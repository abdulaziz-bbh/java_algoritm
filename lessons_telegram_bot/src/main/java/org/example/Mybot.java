package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;
import java.util.Set;

public class Mybot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {


if(update.hasMessage() && update.getMessage().hasText()){
   // String message = update.getMessage().getText();
    Long chatId = update.getMessage().getChatId();
    SendMessage sendMessage = new SendMessage();
    sendMessage.setChatId(chatId);
  //  System.out.println(chatId);
    sendMessage.setText("As-salāmu ‘alaykum wa raḥmatullāhi wa barakātuh.");
    sendMessage.setParseMode(ParseMode.HTML);
    sendMessage.setAllowSendingWithoutReply(true);
    sendMessage.setDisableWebPagePreview(false);
    sendMessage.setReplyToMessageId(update.getMessage().getMessageId());
    sendMessage.setProtectContent(true);

    try{
        execute(sendMessage);
    }catch (TelegramApiException e){
        throw new RuntimeException(e);
    }

}

        if (update.hasMessage() && update.getMessage().hasPhoto()){
            Long chatId = update.getMessage().getChatId();
            List<PhotoSize> list = update.getMessage().getPhoto();

            PhotoSize photoSize = list.get(list.size()-1);
            String fileId = photoSize.getFileId();

            SendPhoto sendPhoto = new SendPhoto();
            sendPhoto.setChatId(chatId);
            System.out.println(chatId);
            sendPhoto.setPhoto(new InputFile(photoSize.getFileId()));

            try {
                execute(sendPhoto);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }


        if (update.hasMessage() && update.getMessage().hasAudio()){
            Audio audio = update.getMessage().getAudio();
            long chatId = update.getMessage().getChatId();
            SendAudio sendAudio = new SendAudio();
            sendAudio.setAudio(new InputFile(audio.getFileId()));
            sendAudio.setChatId(chatId);
            sendAudio.setCaption("Siz yuborgan audio habar");
            try {
                execute(sendAudio);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        }




        if (update.hasMessage() && update.getMessage().hasVideo()) {
            long chatId = update.getMessage().getChatId();
            Video video = update.getMessage().getVideo();
            // SendVide class sidan obyekt yaratamiz
            SendVideo sendVideo = new SendVideo();
            sendVideo.setVideo(new InputFile(video.getFileId()));
            sendVideo.setChatId(chatId);
            try {
                execute(sendVideo);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }


        if (update.hasMessage() && update.getMessage().hasText()) {
            if (update.getMessage().getText().equals("/start")) {
                // ChatId ni o'zgaruvchiga tenglab olamiz.
                Long chatId = update.getMessage().getChatId();
                send(chatId, "Assalomalekom keling o'yin o'yaymiz\uD83D\uDE0E \n \uD83C\uDFB2 \n \uD83C\uDFAF \nO'yinlardan birini yuboring");
            }
        }

        else if (update.hasMessage() && update.getMessage().hasDice()) {
            Dice dice = update.getMessage().getDice();
            Long chatId = update.getMessage().getChatId();
            // 🎲
            if (dice.getEmoji().equals("\uD83C\uDFB2")) {
                if (dice.getValue() == 6) {
                    send(chatId, "Tabriklaymiz siz g'alaba qozondingiz");
                } else if (dice.getValue() == 5) {
                    send(chatId, "Azgina qolgan ediyaa");
                } else {
                    send(chatId, "Qayta urunib ko'ring");
                }
            }
            // 🎯
            else if (dice.getEmoji().equals("\uD83C\uDFAF")) {
                if (dice.getValue() == 6) {
                    send(chatId, "Tabriklaymiz siz g'alaba qozondingiz");
                } else if (dice.getValue() == 5) {
                    send(chatId, "Azgina qolgan ediyaa");
                } else {
                    send(chatId, "Qayta urunib ko'ring");
                }
            }
        }


    }

    private void send(Long chatId, String text) {
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
    public String getBotToken(){
        return "7710754391:AAH8QtS8-bddm7vvvgxOTmJbCIih3OrndXs";
    }






}
