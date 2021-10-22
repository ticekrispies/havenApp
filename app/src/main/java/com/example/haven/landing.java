package com.example.haven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class landing extends AppCompatActivity {

    public void goBack(View v){
        finish();
    }

    public void openPersonality(View v){
        startActivity(new Intent(this, personality.class));
    }

    public void openMindful(View v){
        startActivity(new Intent(this, mindful.class));
    }

    public void openMedia(View v){
        startActivity(new Intent(this, media.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
    }
}