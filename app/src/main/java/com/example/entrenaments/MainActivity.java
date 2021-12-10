package com.example.entrenaments;

import static com.example.entrenaments.Entrenament.entrenaments;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity implements TrainingSeriesFragment.Listener {

    ListView listview;
    ArrayAdapter<Entrenament> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<Entrenament>(this,
                android.R.layout.simple_list_item_1, entrenaments);
        listview.setAdapter(adapter);

    }

    @Override
    public void itemClicked(long id) {

        
    }
}