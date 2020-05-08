package com.example.td1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends BaseActivity implements MainInterface{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chat chat = new Chat("toto",2);

        showError();
    }

    @Override
    public void showList(List<Chat> list) {
        //TODO Faire le vrai code
    }

    @Override
    public void showLoader() {

    }

    @Override
    public void showError() {

    }
}
