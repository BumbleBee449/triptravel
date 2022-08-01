package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bus extends AppCompatActivity implements View.OnClickListener {
    Button book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        book = findViewById(R.id.chip4);
        book.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Thanks for booking our bus", Toast.LENGTH_SHORT).show();
    Intent intent = new Intent(this,aboutHotel.class);
    startActivity(intent);}
}