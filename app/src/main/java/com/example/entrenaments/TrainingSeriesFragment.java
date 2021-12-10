package com.example.entrenaments;

import static com.example.entrenaments.Entrenament.entrenaments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TrainingSeriesFragment extends ListFragment {


    private final int[] BOTONESMENU = {R.id.agonia, R.id.correr,
            R.id.especial,R.id.fuerza};


    public TrainingSeriesFragment() {
        // Required empty public constructor
    }

    static interface Listener{
     void itemClicked(long id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_training_series, container, false);
    }
}