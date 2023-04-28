package com.example.challenge3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button nextBtn;
    Button prevBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nextBtn = findViewById(R.id.button2);
        prevBtn = findViewById(R.id.button3);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToThirdActivity();
            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchBackToFirstActivity();
            }
        });
    }

    private void switchBackToFirstActivity() {
        Intent switchBack = new Intent(this, MainActivity.class);
        startActivity(switchBack);
    }

    private void switchToThirdActivity() {
        Intent switchToSecondActivity = new Intent(this, MainActivity3.class);
        startActivity(switchToSecondActivity);
    }


}