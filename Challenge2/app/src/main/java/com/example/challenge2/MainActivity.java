package com.example.challenge2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

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


    }

    private void checkIfEmailAndPhoneAreOK(){
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private boolean checkIfEmailIsOK(){

    }
}