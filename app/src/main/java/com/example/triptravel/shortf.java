package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class shortf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shortf);
    }

    public void merica(View view) {
        Intent intent = new Intent(this, merica.class);
        startActivity(intent);
    }

    public void delta(View view) {
        Intent intent = new Intent(this, delta.class);
        startActivity(intent);
    }

    public void aviro(View view) {
        Intent intent = new Intent(this, aviro.class);
        startActivity(intent);
    }
}