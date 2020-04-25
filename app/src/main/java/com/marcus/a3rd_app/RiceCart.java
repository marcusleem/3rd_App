package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RiceCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ricecart);
    }

    public void mainpage(View view) {
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }
    public void back1(View view) {
        Intent intent = new Intent(this,RicePage.class);
        startActivity(intent);
    }
    public void checkout(View view) {
        Intent intent = new Intent(this,PayPage3.class);
        startActivity(intent);
    }


}