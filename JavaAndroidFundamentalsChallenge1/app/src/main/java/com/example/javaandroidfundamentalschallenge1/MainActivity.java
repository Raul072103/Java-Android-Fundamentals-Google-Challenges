package com.example.javaandroidfundamentalschallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    Button button1;
    CheckBox notifyCheckBox ;
    EditText editText1;
    RadioGroup radioGroup;
    RadioButton yes;
    RadioButton no;
    RadioButton test;
    ToggleButton toggleButton;
    Spinner spinner;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.textView1);
        button1 = findViewById(R.id.button1);
        notifyCheckBox = findViewById(R.id.checkBox);
        editText1 = findViewById(R.id.editTextText3);
        radioGroup = findViewById(R.id.radioGroup);
        yes = findViewById(R.id.radioButton);
        no = findViewById(R.id.radioButton2);
        spinner = findViewById(R.id.spinner);

        adapter = ArrayAdapter.createFromResource(this, R.array.countries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        

        notifyCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(notifyCheckBox.isChecked()){
                    editText1.setText("NOTIFY TRUE");
                }
                else{
                   // editText1.setText("NOTIFY FALSE");
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setBackgroundColor(Color.BLACK);
                button1.setTextColor(Color.WHITE);
                text1.setText("I have done my magic");
                text1.setVisibility(View.INVISIBLE);
                button1.setVisibility(View.INVISIBLE);

            }
        });
    }
}