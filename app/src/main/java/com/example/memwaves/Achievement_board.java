package com.example.memwaves;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Achievement_board extends AppCompatActivity {

    ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement_board);

        imageView = findViewById(R.id.a1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Achievement_board.this, Achievement1.class);
                startActivity(intent);
            }
        });

        imageView = findViewById(R.id.a2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Achievement_board.this, Achievement2.class);
                startActivity(intent);
            }
        });

        imageView = findViewById(R.id.a3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Achievement_board.this, Achievement3.class);
                startActivity(intent);
            }
        });

        imageView = findViewById(R.id.a4);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Achievement_board.this, Achievement4.class);
                startActivity(intent);
            }
        });

        //back to main page
        imageView = findViewById(R.id.back);
        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Achievement_board.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}