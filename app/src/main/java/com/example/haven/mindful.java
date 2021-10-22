package com.example.haven;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class mindful extends AppCompatActivity {

    public void goBackMindful(View v){
        finish();
    }

    Button inspire;
    Button searchQuote;
    Button videoOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindful);

        inspire = findViewById(R.id.button8);
        searchQuote = findViewById(R.id.button9);
        videoOpen = findViewById(R.id.button7);

        inspire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder message = new AlertDialog.Builder(mindful.this);
                message.setTitle("Notice");
                message.setMessage("This would return a quote from the API, upon each press it will be a new entry.");
                message.show();
            }
        });

        searchQuote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder message = new AlertDialog.Builder(mindful.this);
                message.setTitle("Notice");
                message.setMessage("This would open a page with form allowing the user to search a quotes database using keywords, names, etc.");
                message.show();
            }
        });

        videoOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder message = new AlertDialog.Builder(mindful.this);
                message.setTitle("Notice");
                message.setMessage("This would open a random YouTube video link, by opening the YouTube app.");
                message.show();
            }
        });
    }
}