package com.gamatechno.gtapps.Login;

import com.gamatechno.gtapps.Chat.ChatViewFragment;
import com.gamatechno.gtapps.ContactModel;

public class LoginPresenter implements LoginInterface.Presenter {
    private LoginInterface.View view;
    private ContactModel model;

    public LoginPresenter(LoginInterface.View view) {
        this.view = view;
        model = new ContactModel();

    }

    @Override
    public void loadChatFragment() {
        view.changeFragment(new ChatViewFragment());
    }

    @Override
    public  void loginAction(String username, String pass){
        
    }

    @Override
    public void setToken() {

    }

    @Override
    public void verifyToken() {

    }
}
