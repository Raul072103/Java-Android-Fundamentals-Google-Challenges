package com.example.challenge4_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Names> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerVIew);
        addNames();
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new NamesAdapter(names));
    }

    private void addNames() {
        names = new ArrayList<>();

        names.add(new Names("Raul", "Spatariu"));
        names.add(new Names("Raul", "Spatariu"));
        names.add(new Names("Raul", "Spatariu"));
        names.add(new Names("Raul", "Spatariu"));
        names.add(new Names("Raul", "Spatariu"));
        names.add(new Names("Raul", "Spatariu"));
        names.add(new Names("Raul", "Spatariu"));
        names.add(new Names("Raul", "Spatariu"));
        names.add(new Names("Raul", "Spatariu"));
        names.add(new Names("Raul", "Spatariu"));


    }
}