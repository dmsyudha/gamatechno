package com.gamatechno.gtapps.Contacts;

import com.gamatechno.gtapps.ContactModel;
import com.gamatechno.gtapps.UserModel;

public interface ContactInterface {

    interface  View {
        void isContactOnline(boolean b);
        void isMessageNotif(boolean b);
    }

    interface Presenter {
        void onSelectContact(ContactModel contact);
    }
}