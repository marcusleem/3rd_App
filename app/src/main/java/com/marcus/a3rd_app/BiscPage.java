package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BiscPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisc);
    }

    public void backarrow8(View view) {
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }
    public void cart(View view) {
        Intent intent = new Intent(this, CartPage.class);
        startActivity(intent);
    }

    public void search(View view) {
        Intent intent = new Intent(this,Search.class);
        startActivity(intent);
    }
    public void biscCart(View view) {
        Intent intent = new Intent(this,BiscCart.class);
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