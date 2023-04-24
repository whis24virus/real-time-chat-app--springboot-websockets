package com.chat.app.chatroomapp.controllers;

import com.chat.app.chatroomapp.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @SendTo("/topic/return-to") // subscriber url to get messages
    @MessageMapping("/message") // client will send message to this url
    public Message getContent(@RequestBody Message message){
//        try{
//            //processing
//            Thread.sleep(10);
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }
        return message;
    }

}
