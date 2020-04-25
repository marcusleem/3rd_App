package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PayPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay2);
        Button onClickPay = (Button) findViewById(R.id.payy);

        onClickPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PayPage2.this, Donate.class);
                startActivity(intent);
            }
        });
    }
    public void backkk(View view) {
        Intent intent = new Intent(this,RicePage.class);
        startActivity(intent);
    }
}