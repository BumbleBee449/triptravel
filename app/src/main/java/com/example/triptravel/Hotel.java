package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hotel extends AppCompatActivity implements View.OnClickListener {
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        register = findViewById(R.id.register);
        register.setOnClickListener(this);
}

    @Override
    public void onClick(View view) {

        Toast.makeText(Hotel.this, "Thank you for registering", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Homescreen.class);
        startActivity(intent);
    }}