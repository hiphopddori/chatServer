package com.ddori.chat.presentation.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ChatRoom {

    private String id;
    private String name;

    @Builder
    public ChatRoom(String name) {
        this.name = name;
    }
}
