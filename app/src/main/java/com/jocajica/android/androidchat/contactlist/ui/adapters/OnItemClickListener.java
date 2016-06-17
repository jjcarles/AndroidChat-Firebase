package com.jocajica.android.androidchat.contactlist.ui.adapters;

import com.jocajica.android.androidchat.entities.User;

/**
 * Created by avalo.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
