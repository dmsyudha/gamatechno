package com.gamatechno.gtapps;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.gamatechno.gtapps.Chat.ChatViewFragment;
import com.gamatechno.gtapps.Contacts.ContactViewFragment;
import com.gamatechno.gtapps.Login.LoginViewFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences userData = getApplicationContext().getSharedPreferences("Login", Context.MODE_PRIVATE);
        String cookieName = userData.getString("cookieName", "0");
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        if(cookieName=="0"){
            bottomNavigationView.setVisibility(View.INVISIBLE);
            loadFragment(new LoginViewFragment());
        }else {
            loadFragment(new ChatViewFragment());
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_activity, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    // method listener untuk logika pemilihan
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.chat:
                fragment = new ChatViewFragment();
                break;
            case R.id.contact:
                fragment = new ContactViewFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
