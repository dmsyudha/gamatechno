package com.gamatechno.gtapps.Login;

import androidx.fragment.app.Fragment;

public interface LoginInterface {

    interface  View {
        void enableButton(boolean b);
        void errorUsername(boolean b);
        void changeFragment(Fragment f);
    }

    interface Presenter {
        void loadChatFragment();
        void loginAction(String username, String pass);
        void setToken();
        void verifyToken();
    }
}