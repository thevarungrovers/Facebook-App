package com.example.facebookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import android.view.View;
import android.widget.Button;
//import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class register_activity extends AppCompatActivity {

    EditText name, phone, email, password;
    Button signup;
//    DatePicker dob;

    String inputName, inputEmail, inputPhone, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        name.findViewById(R.id.name_input_id);
        inputName = name.getText().toString();

        phone.findViewById(R.id.phone_input_id);
        inputPhone = phone.getText().toString();

        email.findViewById(R.id.email_input_id);
        inputEmail = email.getText().toString();

        password.findViewById(R.id.password_input_id);
        inputPassword = password.getText().toString();

//        dob.findViewById(R.id.dob_input_id);
//        inputDob = dob.getD();

        signup.setOnClickListener(v -> {
            if(!inputName.equals("")){
                Toast.makeText(getApplicationContext(),"All Fields are required", Toast.LENGTH_LONG).show();
            }
        });

    }
}