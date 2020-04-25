package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Donate extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
    }
    public void backarrow8(View view) {
        Intent intent = new Intent(this,PayPage1.class);
        startActivity(intent);
    }

    public void redcross(View view){
        Intent intent = new Intent(this,RedCross.class);
        startActivity(intent);
    }

    public void minds(View view){
        Intent intent = new Intent(this,Minds.class);
        startActivity(intent);
    }

    public void heart(View view){
        Intent intent = new Intent(this,Heart.class);
        startActivity(intent);
    }

    public void bank(View view){
        Intent intent = new Intent(this,Bank.class);
        startActivity(intent);
    }


}