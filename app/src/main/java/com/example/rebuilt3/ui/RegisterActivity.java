package com.example.rebuilt3.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.rebuilt3.R;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity
{
    TextInputEditText textEmail,textPassword;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textEmail = (TextInputEditText)findViewById(R.id.email_register);
        textPassword = (TextInputEditText)findViewById(R.id.password_register);
        progressBar = (ProgressBar)findViewById(R.id.progressBarRegister);
    }

    public void RegisterUser(View v)
    {

    }
    public void gotoLogin(View v)
    {
        Intent i = new Intent(RegisterActivity.this, MainActivity3.class);
        startActivity(i);
    }
}