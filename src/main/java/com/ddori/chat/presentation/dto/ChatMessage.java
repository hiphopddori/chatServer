package com.ddori.chat.presentation.dto;

import com.ddori.chat.domain.MessageType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Setter
@Getter
@NoArgsConstructor
public class ChatMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String chatRoomId;
    private String writer;
    private String message;
    //private MessageType type;

}
