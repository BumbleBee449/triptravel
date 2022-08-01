package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
    }

    public void Sanfrancisco(View view) {
        Intent intent = new Intent(this,Sanfransisco.class);
        startActivity(intent);
    }

    public void Venenzula(View view) {
        Intent intent = new Intent(this,Venenzula.class);
        startActivity(intent);
    }

    public void Mughal(View view) {

        Intent intent = new Intent(this,mughalgarden.class);
        startActivity(intent);
    }

    public void Indiagate(View view) {
        Intent intent = new Intent(this,Indiagate.class);
        startActivity(intent);
    }

    public void tomb(View view) {

        Intent intent = new Intent(this,tomb.class);
        startActivity(intent);
    }

    public void Munnar(View view) {
        Intent intent = new Intent(this,Munna.class);
        startActivity(intent);
    }

    public void London(View view) {
        Intent intent = new Intent(this, london.class);
        startActivity(intent);
    }
}