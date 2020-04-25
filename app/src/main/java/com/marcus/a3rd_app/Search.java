package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Search extends AppCompatActivity {

     EditText Search;
     ImageButton Searching;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Search = (EditText) findViewById(R.id.etSearch);
        Searching = (ImageButton) findViewById(R.id.btnSearching);


        Searching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Search.getText().toString());
            }
        });

    }

    private void validate(String Search){
        if((Search.equals("Fruit"))) {
            Intent intent = new Intent(Search.this, FruitPage.class);
            startActivity(intent);
        }else if((Search.equals("Vegetable"))){
                Intent intent = new Intent(Search.this, VegPage.class);
                startActivity(intent);
        }else if((Search.equals("Rice"))){
            Intent intent = new Intent(Search.this, RicePage.class);
            startActivity(intent);
        }else if((Search.equals("Biscuit"))){
            Intent intent = new Intent(Search.this, BiscPage.class);
            startActivity(intent);
        }else{
            Toast.makeText(Search.this, "Please enter a category!", Toast.LENGTH_SHORT).show();
        }
    }

    public void backarrow8(View view) {
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }

    public void backtomainpage1(View view) {
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }

    public void profile7(View view) {
        Intent intent = new Intent(this,ProfilePage.class);
        startActivity(intent);
    }
}

