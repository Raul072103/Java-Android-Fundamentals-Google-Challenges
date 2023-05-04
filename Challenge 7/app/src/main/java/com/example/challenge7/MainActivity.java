package com.example.challenge7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonText1;
    Button buttonText2;
    Button buttonText3;
    String value;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonText1 = findViewById(R.id.bt1);
        buttonText2 = findViewById(R.id.bt2);
        buttonText3 = findViewById(R.id.bt3);

        Intent intent = new Intent(this, MainActivity2.class);

        buttonText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = String.format(getResources().getString(R.string.text1));
                intent.putExtra("key", value);
                startActivity(intent);
            }
        });

        buttonText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = String.format(getResources().getString(R.string.text2));
                intent.putExtra("key", value);
                startActivity(intent);
            }
        });

        buttonText3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = String.format(getResources().getString(R.string.text3));
                intent.putExtra("key", value);
                startActivity(intent);
            }
        });
    }


}