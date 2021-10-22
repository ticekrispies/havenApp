package com.example.haven;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class personality extends AppCompatActivity {

    Button buttonStartTest;
    Button buttonInfo;

    public void goBackPersonality(View v){
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality);

        buttonStartTest = findViewById(R.id.button5);
        buttonInfo = findViewById(R.id.button6);

        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder testStart = new AlertDialog.Builder(personality.this);
                testStart.setTitle("Notice");
                testStart.setMessage("This would open a window with more information on certain personality types and traits.");
                testStart.show();
            }
        });

        buttonStartTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder testStart = new AlertDialog.Builder(personality.this);
                testStart.setTitle("Notice");
                testStart.setMessage("This would open a window giving the option to start the test.");
                testStart.show();
            }
        });
    }
}