package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go2(View view) {
        Intent go2 = new Intent(this, Act2.class);
        startActivity(go2);
    }

    public void back3(View view) {
        Intent back3 = new Intent(this, Act3.class);
        startActivity(back3);
    }

    public void openFacebook(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://facebook.com/") );

        startActivity( browse );
    }

    public void openSteam(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://steamcommunity.com/profiles/76561198874732816/") );

        startActivity( browse );
    }

    public void openGithub(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://github.com/") );

        startActivity( browse );
    }
}