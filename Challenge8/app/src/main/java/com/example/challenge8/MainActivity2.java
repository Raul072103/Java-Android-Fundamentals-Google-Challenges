package com.example.challenge8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button sendButton2;
    EditText editText2;
    TextView textView3, textView4;

    Intent i2 = new Intent(getApplicationContext(), MainActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        sendButton2 = findViewById(R.id.sendButtonActivity2);
        editText2 = findViewById(R.id.editTextActivity2);
        textView3 = findViewById(R.id.firstTextViewActivity2);

        String stringReceived = getIntent().getStringExtra("key" );
        textView3.setText(stringReceived);
        textView4.setText("Message received");

        sendButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInserted = editText2.getText().toString();
                i2.putExtra("key1", textInserted);
                startActivity(i2);
            }
        });

    }
}