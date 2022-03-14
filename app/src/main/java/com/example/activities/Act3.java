package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Act3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
    }

    public void back2(View view) {
        Intent back2 = new Intent(this, Act2.class);
        startActivity(back2);
    }

    public void go1(View view) {
        Intent go1 = new Intent(this, MainActivity.class);
        startActivity(go1);
    }
}