package com.gamatechno.gtapps.Chat;

import com.gamatechno.gtapps.Login.LoginInterface;
import com.gamatechno.gtapps.ContactModel;

public class ChatPresenter implements ChatInterface.Presenter {
    private LoginInterface.View view;
    private ContactModel model;

    public ChatPresenter(LoginInterface.View view) {
        this.view = view;
        model = new ContactModel();

    }

    @Override
    public void getAllMessages() {

    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void onMessageFailed() {

    }

    @Override
    public void receiveMessage() {

    }
}
