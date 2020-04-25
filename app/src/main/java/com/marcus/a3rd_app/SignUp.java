package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    EditText userName, userPassword, userEmail;
    Button regButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        setupUIViews();

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userName.length()== 0 || userPassword.length()==0 || userEmail.length()==0){
                    Toast.makeText(SignUp.this, "Please enter your username, password and email above", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(SignUp.this, SignIn.class);
                    startActivity(intent);
                }
            }
        });
    }
        public void setupUIViews () {
            userName = (EditText) findViewById(R.id.etUserName);
            userEmail = (EditText) findViewById(R.id.etUserEmail);
            userPassword = (EditText) findViewById(R.id.etUserPassword);
            regButton = (Button) findViewById(R.id.btnRegister);
        }

    public Boolean validate () {
        Boolean result = false;

        String name = userName.getText().toString();
        String password = userPassword.getText().toString();
        String email = userEmail.getText().toString();

        if (name.isEmpty() || password.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT).show();
        } else {
            result = true;
        }

        return result;
    }

    public void backarrow2 (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
