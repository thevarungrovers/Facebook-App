package com.example.facebookapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
//import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class register_activity extends AppCompatActivity {

//    DatePicker dob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register); // connect with xml

//        Create new account
        //  object creation and mapping id
        EditText name = (EditText) findViewById(R.id.name_input_id);
        EditText phone = (EditText) findViewById(R.id.phone_input_id);
        EditText email = (EditText) findViewById(R.id.email_input_id);
        EditText password = (EditText) findViewById(R.id.newPassword_input_id);
        Button createAccount = (Button) findViewById(R.id.create_button_id);



//        dob.findViewById(R.id.dob_input_id);
//        inputDob = dob.getD();

//            on click listener | create new account button
        createAccount.setOnClickListener(v -> {
            //        strings to save input from frontend
            String input_name = name.getText().toString();
            String input_phone = phone.getText().toString();
            String input_email = email.getText().toString();
            String input_password = password.getText().toString();

            // to get the values from calender
//            DatePicker datePicker = (DatePicker) findViewById(R.id.dob_input_id);
//            int day = datePicker.getDayOfMonth();
//            int month = datePicker.getMonth() + 1;
//            int year = datePicker.getYear();



            // empty fields
            if(input_name.equals("") || input_name.equals(" ") || input_phone.equals("")|| input_phone.equals(" ") || input_email.equals("") || input_email.equals(" ") || input_password.equals("") || input_password.equals(" ")){
                Toast.makeText(getApplicationContext(),"Please Enter the All the fields", Toast.LENGTH_LONG).show();
            }
            // all entered data
            else{
                Toast.makeText(getApplicationContext()," Hello... " + input_name + "  Your Account Created Successfully", Toast.LENGTH_LONG).show();
            }

        });

    }
}