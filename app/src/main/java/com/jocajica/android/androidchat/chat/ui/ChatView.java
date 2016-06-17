package com.jocajica.android.androidchat.chat.ui;

import com.jocajica.android.androidchat.entities.ChatMessage;

/**
 * Created by avalo.
 */
public interface ChatView {
    void onMessageReceived(ChatMessage msg);
}
