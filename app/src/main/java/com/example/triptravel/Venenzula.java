package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Venenzula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venenzula);

    }

    public void bookhotels(View view) {

        Intent intent = new Intent(this, flights.class);
        startActivity(intent);
    }

    public void Home(View view) {

        Intent intent = new Intent(this, Homescreen.class);
        startActivity(intent);
    }
}