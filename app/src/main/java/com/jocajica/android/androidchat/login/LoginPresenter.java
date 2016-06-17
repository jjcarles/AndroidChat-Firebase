package com.jocajica.android.androidchat.login;

import com.jocajica.android.androidchat.login.events.LoginEvent;

/**
 * Created by avalo.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void onResume();
    void onPause();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent event);
}
