package com.example.challenge2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    CheckBox acceptTermsCheckBox;
    EditText emailEditText, phoneEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.emailTextEdit);
        phoneEditText = findViewById(R.id.phoneEditText);
        submitButton = findViewById(R.id.button);

        checkIfEmailAndPhoneAreOK();
    }

    private void checkIfEmailAndPhoneAreOK(){
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String phone = phoneEditText.getText().toString();

                boolean check = validateInfo(email, phone);

                    if(check == true){
                        Toast.makeText(getApplicationContext(), "Data is valid", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(), "Sorry check information again", Toast.LENGTH_LONG).show();
                    }
            }

        });
    }

    private boolean validateInfo(String email, String phone) {
       // email.trim();
        if(email.length() == 0){
            emailEditText.requestFocus();
            emailEditText.setError("Field cannot be empty");
            return false;
        }else if(! email.matches("^[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")){
            emailEditText.requestFocus();
            emailEditText.setError("Enter a valid email");
            return false;
        }else if(phone.length() == 0){
            emailEditText.requestFocus();
            emailEditText.setError("Field cannot be empty");
            return false;
        }else if(! phone.matches("[0-9]{10,13}$")){
            phoneEditText.requestFocus();
            phoneEditText.setError("Enter a valid phone number");
            return false;
        }else return true;

    }

}