package com.example.challenge8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button sendButton1;
    EditText editText1;
    TextView textView1, textView2;
    String stringInEditText;
    Intent i1 = new Intent(getApplicationContext(), MainActivity2.class);


   // @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton1 = findViewById(R.id.sendButtonActivity1);
        editText1 = findViewById(R.id.editTextActivity1);

        sendButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInserted = editText1.getText().toString();
                i1.putExtra("key1", textInserted);
                startActivity(i1);
            }
        });

        Log.d("Message", "activity1 onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView1 = findViewById(R.id.firstTextViewActivity1);
        textView2 = findViewById(R.id.secondTextViewActivity1);
    }
}