package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class flights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flights);
    }

    public void delta(View view) {
        Intent intent = new Intent(this, delta.class);
        startActivity(intent);
    }

    public void merica(View view) {
        Intent intent = new Intent(this, merica.class);
        startActivity(intent);
    }

    public void aviro(View view) {
        Intent intent = new Intent(this, aviro.class);
        startActivity(intent);
    }

    public void Sunset(View view) {
        Intent intent = new Intent(this, bus.class);
        startActivity(intent);
    }

    public void Go(View view) {
        Intent intent = new Intent(this, Gomovers.class);
        startActivity(intent);
    }

    public void feet(View view) {
        Intent intent = new Intent(this, flyingfee.class);
        startActivity(intent);
    }
}