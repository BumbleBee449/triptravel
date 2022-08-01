package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nilgiri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilgiri);
    }

    public void book(View view) {
        Intent intent = new Intent(this, flights.class);
        startActivity(intent);
    }

    public void Back(View view) {
        Intent intent = new Intent(this, Homescreen.class);
        startActivity(intent);
    }
}