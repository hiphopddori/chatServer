package com.ddori.chat.presentation;

import com.ddori.chat.domain.MessageType;
import com.ddori.chat.presentation.dto.ChatMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ChatRestController {

    private final SimpMessageSendingOperations messagingTemplate;

    @MessageMapping(value = "/chat/join")
    public void join(@Payload ChatMessage message) {
        message.setMessage(message.getWriter() + "님이 입장하셨습니다.");
        messagingTemplate.convertAndSend("/subscribe/chat/room", message);
    }

    @MessageMapping("/chat/message")
    public void message(ChatMessage message) {
        messagingTemplate.convertAndSend("/subscribe/chat/room", message);
    }


}
