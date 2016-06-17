package com.jocajica.android.androidchat.addcontact;

import com.jocajica.android.androidchat.addcontact.events.AddContactEvent;

/**
 * Created by avalo.
 */
public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
