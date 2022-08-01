package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class aviro extends AppCompatActivity implements View.OnClickListener {
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aviro);
        register = findViewById(R.id.chip4);
        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(aviro.this,"Thank you for booking our Flight",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, aboutHotel.class);
        startActivity(intent);
    }
}