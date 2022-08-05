package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

    }

    public void Dal(View view) {
        Intent intent = new Intent(this,DalLake.class);
        startActivity(intent);
    }

    public void Nilgiri(View view) {
        Intent intent = new Intent(this,nilgiri.class);
        startActivity(intent);
    }

    public void map(View view) {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void Places(View view) {
        Intent intent =new Intent(this, places.class);
        startActivity(intent);
    }

    public void hotel(View view) {
        Intent intent = new Intent(this,aboutHotel.class);
        startActivity(intent);
    }

    public void flight(View view) {
        Intent intent = new Intent(this, shortf.class);
        startActivity(intent);
    }

    public void train(View view) {
        Intent intent = new Intent(this, train.class);
        startActivity(intent);
    }

    public void bus(View view) {
        Intent intent = new Intent(this, shortbMainActivity2.class);
        startActivity(intent);
    }

    public void display(View view) {
        Intent intent = new Intent(this, displaydata.class);
        startActivity(intent);
    }
}