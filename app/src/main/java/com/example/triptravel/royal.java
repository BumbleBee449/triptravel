package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class royal extends AppCompatActivity implements View.OnClickListener {
    Button book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royal);
        book = findViewById(R.id.chip4);
        book.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Toast.makeText(royal.this,"Thank you for booking our Hotel",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Homescreen.class);
        startActivity(intent);
    }
}