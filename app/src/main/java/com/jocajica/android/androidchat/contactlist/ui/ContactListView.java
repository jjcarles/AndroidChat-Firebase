package com.jocajica.android.androidchat.contactlist.ui;

import com.jocajica.android.androidchat.entities.User;

/**
 * Created by avalo.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
