package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class shortbMainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shortb_main2);
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