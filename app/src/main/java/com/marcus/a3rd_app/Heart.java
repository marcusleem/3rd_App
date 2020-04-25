package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Heart extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);
    }
    public void mainpage(View view) {
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }
}