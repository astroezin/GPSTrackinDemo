package com.example.gpstrackindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowShavedLocationsList extends AppCompatActivity {
ListView lv_savedLocations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_shaved_locations_list);
        lv_savedLocations=findViewById(R.id.lv_wayPoints);
        MyApplication myApplication=(MyApplication)getApplicationContext();
        List<Location> savedLocation=myApplication.getMyLocation();
        lv_savedLocations.setAdapter(new ArrayAdapter<Location>(this, android.R.layout.simple_list_item_1,savedLocation));
    }
}