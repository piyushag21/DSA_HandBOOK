package com.example.rebuilt3.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.example.rebuilt3.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity3 extends AppCompatActivity
{
    TextInputEditText textEmail,textPassword;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textEmail = (TextInputEditText)findViewById(R.id.email_login);
        textPassword = (TextInputEditText)findViewById(R.id.password_login);
        progressBar = (ProgressBar)findViewById(R.id.progressbarLogin);
    }

    public void LoginUser(View v)
    {

    }
    public void gotoRegister(View v)
    {
        Intent i = new Intent(MainActivity3.this, RegisterActivity.class);
        startActivity(i);
    }

    public void forgotPassword(View v)
    {

    }
}