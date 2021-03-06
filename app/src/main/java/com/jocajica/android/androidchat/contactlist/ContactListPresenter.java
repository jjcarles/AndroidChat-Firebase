package com.jocajica.android.androidchat.contactlist;

import com.jocajica.android.androidchat.contactlist.events.ContactListEvent;

/**
 * Created by avalo.
 */
public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
