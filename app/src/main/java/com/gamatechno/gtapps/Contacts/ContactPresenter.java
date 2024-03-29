package com.gamatechno.gtapps.Contacts;

import com.gamatechno.gtapps.Login.LoginInterface;
import com.gamatechno.gtapps.ContactModel;

public class ContactPresenter implements LoginInterface.Presenter {
    private LoginInterface.View view;
    private ContactModel model;

    public ContactPresenter(LoginInterface.View view) {
        this.view = view;
        model = new ContactModel();

    }

    @Override
    public void loadNextScreen() {
        view.navigateNextScreen();
    }

    @Override
    public void defaultSettings() {

    }

    @Override
    public void verifyEntries() {

    }


    @Override
    public void savePassword(String password) {
    }

    @Override
    public String appendIndvidualPassword(String first, String second, String third, String fourth) {
        StringBuilder sb = new StringBuilder();
        sb.append(first).append(second).append(third).append(fourth);
        return sb.toString();
    }
}
