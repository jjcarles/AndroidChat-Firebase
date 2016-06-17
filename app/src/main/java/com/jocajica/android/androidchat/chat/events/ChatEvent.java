package com.jocajica.android.androidchat.chat.events;

import com.jocajica.android.androidchat.entities.ChatMessage;

/**
 * Created by avalo.
 */
public class ChatEvent {
    private ChatMessage message;

    public ChatMessage getMessage() {
        return message;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }
}
