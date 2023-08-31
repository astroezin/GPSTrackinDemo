package com.example.gpstrackindemo;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application{
    private static MyApplication singleton;
    private List<Location> myLocation;

    public List<Location> getMyLocation() {
        return myLocation;
    }

    public void setMyLocation(List<Location> myLocation) {
        this.myLocation = myLocation;
    }

    public MyApplication getInstance(){
        return singleton;
    }
    public void onCreate(){
        super.onCreate();
        singleton=this;
myLocation=new ArrayList<>();
    }


}
