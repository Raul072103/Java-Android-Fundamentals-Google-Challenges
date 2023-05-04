package com.example.challenge7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    String textDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.displayText);

        textDisplay = getIntent().getStringExtra("key");

        if(textDisplay != null){
            textView.setText(textDisplay);
        }
    }
}