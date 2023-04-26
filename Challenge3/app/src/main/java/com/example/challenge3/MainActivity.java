package com.example.challenge3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1 ;
    TextView text2 ;
    TextView text3 ;
    TextView text4 ;
    TextView text5;
    TextView text6 ;
    TextView text7 ;
    TextView text8 ;
    TextView text9 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         text1 = findViewById(R.id.textView1);
         text2 = findViewById(R.id.textView2);
         text3 = findViewById(R.id.textView3);
         text4 = findViewById(R.id.textView4);
         text5 = findViewById(R.id.textView5);
         text6 = findViewById(R.id.textView6);
         text7 = findViewById(R.id.textView7);
         text8 = findViewById(R.id.textView8);
         text9 = findViewById(R.id.textView9);

        String message = getString(R.string.repetitive_message);
        text1.setText(message);
        text2.setText(message);
        text3.setText(message);
        text4.setText(message);
        text5.setText(message);
        text6.setText(message);
        text7.setText(message);
        text8.setText(message);
        text9.setText(message);

    }
}