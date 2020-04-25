package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
    }
    public void search(View view) {
        Intent intent = new Intent(this,Search.class);
        startActivity(intent);
    }

    public void fruit(View view) {
        Intent intent = new Intent(this,FruitPage.class);
        startActivity(intent);
    }

    public void veg(View view) {
        Intent intent = new Intent(this,VegPage.class);
        startActivity(intent);
    }

    public void rice(View view) {
        Intent intent = new Intent(this, RicePage.class);
        startActivity(intent);
    }

    public void bisc(View view) {
        Intent intent = new Intent(this, BiscPage.class);
        startActivity(intent);
    }

    public void cart(View view) {
        Intent intent = new Intent(this, CartPage.class);
        startActivity(intent);
    }

    public void mainpage(View view) {
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }

    public void profile6(View view) {
        Intent intent = new Intent(this,ProfilePage.class);
        startActivity(intent);
    }
}
