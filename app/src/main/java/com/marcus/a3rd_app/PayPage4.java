package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PayPage4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay4);
        Button onClickPay = (Button) findViewById(R.id.payy);

        onClickPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PayPage4.this, Donate.class);
                startActivity(intent);
            }
        });
    }
    public void backkkkk(View view) {
        Intent intent = new Intent(this,VegPage.class);
        startActivity(intent);
    }
}