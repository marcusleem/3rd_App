package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PayPage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        Button onClickPay = (Button) findViewById(R.id.payy);

        onClickPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PayPage1.this, Donate.class);
                startActivity(intent);
            }
        });
    }
    public void backk(View view) {
        Intent intent = new Intent(this,AppleCart.class);
        startActivity(intent);
    }

}