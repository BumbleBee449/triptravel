package com.example.triptravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,phone,email;
    Button Signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        Signup = findViewById(R.id.Signup);

        Signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Savedata(view);
            }
        });
    }

    private void Savedata(View view) {
        String Name = name.getText().toString();
        String Phone = phone.getText().toString();
        String Mail = email.getText().toString();
        SharedPreferences sharedPreferences = getSharedPreferences("user", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("email", Mail);
        editor.putString("name", Name);
        editor.putString("phone", Phone);
        editor.apply();

        Intent intent = new Intent(this,Homescreen.class);
        startActivity(intent);

    }

}