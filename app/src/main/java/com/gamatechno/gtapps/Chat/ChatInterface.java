package com.gamatechno.gtapps.Chat;

public interface ChatInterface {

    interface  View {
        void isMessageSent(boolean b);
        void onReceiveMessage(boolean b);
        void noInternetConnection(boolean b);
    }

    interface Presenter {
        void getAllMessages();
        void sendMessage();
        void onMessageFailed();
        void receiveMessage();
    }
}