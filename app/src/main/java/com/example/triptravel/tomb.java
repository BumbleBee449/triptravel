package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tomb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomb);
    }

    public void move(View view) {


        Intent intent = new Intent(this,places.class);
        startActivity(intent);
    }

    public void bookhotels(View view) {
        Intent intent = new Intent(this,flights.class);
        startActivity(intent);
    }
}