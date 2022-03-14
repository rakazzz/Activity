package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
    }

    public void back1(View view) {
        Intent back1 = new Intent(this, MainActivity.class);
        startActivity(back1);
    }

    public void goTo3(View view) {
        Intent go3 = new Intent(this, Act3.class);
        startActivity(go3);
    }
}