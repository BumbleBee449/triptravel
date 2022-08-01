package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class aboutHotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_hotel);
    }

    public void royal(View view) {
        Intent intent = new Intent(this, royal.class );
        startActivity(intent);
    }

    public void star(View view) {
        Intent intent = new Intent(this, Star.class );
        startActivity(intent);
    }

    public void Skyhigh(View view) {
        Intent intent = new Intent(this, Skyhigh.class );
        startActivity(intent);
    }
}