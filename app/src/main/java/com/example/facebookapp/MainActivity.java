package com.example.facebookapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        forgot password
        // on click listener | to open forgot password activity
        TextView clickHere = (TextView) findViewById(R.id.clickHere_text_id);
        clickHere.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, forgot_password.class);
            startActivity(i);
        });

//        create account page
        Button createAccount = findViewById(R.id.createAccount_button_id);  //  object creation and mapping id
           //  on click event | Create new account button
        createAccount.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, register_activity.class);
            startActivity(intent);
        });

//        login page
        EditText username = (EditText) findViewById(R.id.username_input_id); //  object creation and mapping id
        EditText password = (EditText) findViewById(R.id.password_input_id); //  object creation and mapping id

        Button btn = (Button) findViewById(R.id.login_btn_id); //  object creation and mapping id

            //   on click event | LOG IN Button
        btn.setOnClickListener(v -> {
            String input_username = username.getText().toString(); // getting input from frontend
            String input_password = password.getText().toString(); // getting input from frontend

            // empty input fields
            if(input_username.equals("") || input_username.equals(" ") || input_password.equals("") || input_password.equals(" ")){
                Toast.makeText(getApplicationContext(),"Please enter the both fields", Toast.LENGTH_LONG).show(); // Notification
            }
            // correct info
            else if(input_username.equals("JohnDoe") && input_password.equals("JohnDoe")){
                Toast.makeText(getApplicationContext(),"Login Successfully", Toast.LENGTH_LONG).show(); // Notification
            }
            // incorrect info
            else{
                Toast.makeText(getApplicationContext(),"Invalid Credentials", Toast.LENGTH_LONG).show(); // Notification
            }
        });

    }
}