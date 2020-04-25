package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AppleCart extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applecart);
    }

    public void mainpage(View view) {
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }

    public void back3(View view) {
        Intent intent = new Intent(this,FruitPage.class);
        startActivity(intent);
    }
    public void checkout(View view) {
        Intent intent = new Intent(this,PayPage1.class);
        startActivity(intent);
    }
}