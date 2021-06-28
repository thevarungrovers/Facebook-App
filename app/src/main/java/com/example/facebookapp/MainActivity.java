package com.example.facebookapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
//import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        create account
        Button createAccount = findViewById(R.id.createAccount_button_id);
        createAccount.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, register_activity.class);
            startActivity(intent);
        });

//        login
        EditText UserName = (EditText) findViewById(R.id.username_input_id);
        EditText Password = (EditText) findViewById(R.id.password_input_id);

        Button btn = (Button) findViewById(R.id.login_btn_id);

        btn.setOnClickListener(v -> {
            String username = UserName.getText().toString();
            String password = Password.getText().toString();

            if(username.equals("hello") && password.equals("hello")){
                Toast.makeText(getApplicationContext(),"Success", Toast.LENGTH_LONG).show();
            }
        });

    }
}