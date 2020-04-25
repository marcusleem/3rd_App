package com.marcus.a3rd_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgetPassword extends AppCompatActivity {

    EditText passwordEmail;
    Button resetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        passwordEmail = (EditText)findViewById(R.id.etPasswordEmail);
        resetPassword = (Button)findViewById(R.id.btnPasswordReset);

        resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        Toast.makeText(ForgetPassword.this, "Email sent! Please check your email. ", Toast.LENGTH_SHORT).show();
        finish();
        startActivity(new Intent(ForgetPassword.this,SignIn.class));
    }
});
    };

    public void backarrow3(View view) {
        Intent intent = new Intent(this,SignIn.class);
        startActivity(intent);
    }
}