package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private Button Login;
    private TextView forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        Email = (EditText) findViewById(R.id.etEmail);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);
        forgotPassword = (TextView)findViewById(R.id.tvForgetPassword);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Email.length()== 0 || Password.length()==0){
                    Toast.makeText(SignIn.this, "Please enter your email and password above", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(SignIn.this, MainPage.class);
                    startActivity(intent);
                }
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignIn.this, ForgetPassword.class));
            }
        });

    }
    public void ForgetPassword(View view) {
        Intent intent = new Intent(this, ForgetPassword.class);
        startActivity(intent);
    }

    public void backarrow1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

