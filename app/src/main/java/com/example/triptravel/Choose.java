package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Choose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void Hotel(View view) {
        Intent intent = new Intent(this, Hotel.class);
        startActivity(intent);
    }

    public void Main(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);}
}