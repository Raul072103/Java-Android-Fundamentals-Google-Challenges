package com.example.challenge3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Spinner spinner;
    Button prevButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Deserts, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = adapter.getItem(position).toString();
                //if (adapter.getItem(position) != 0) {

                    Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
               // }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        prevButton2 = findViewById(R.id.button4);

        prevButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToTheSecondActivity();
            }
        });
    }

    private void switchToTheSecondActivity() {
        Intent switchBack2 = new Intent(this, MainActivity2.class);
        startActivity(switchBack2);
    }
}