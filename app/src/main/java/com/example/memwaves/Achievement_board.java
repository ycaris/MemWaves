package com.example.memwaves;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Achievement_board extends AppCompatActivity {

    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    int score = 100;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement_board);

        imageView1 = findViewById(R.id.a1);
        if(score> 50){
            imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Achievement_board.this, Achievement1.class);
                    startActivity(intent);
                }
            });
        }else{
            setDisabled(imageView1);
        }


        imageView2 = findViewById(R.id.a2);
        if(score>100){
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Achievement_board.this, Achievement2.class);
                    startActivity(intent);
                }
            });
        }else{
            setDisabled(imageView2);
        }


        imageView3 = findViewById(R.id.a3);
        if (score>150){
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Achievement_board.this, Achievement3.class);
                    startActivity(intent);
                }
            });
        }else{
            setDisabled(imageView3);
        }


        imageView4 = findViewById(R.id.a4);
        if (score>200){
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Achievement_board.this, Achievement4.class);
                    startActivity(intent);
                }
            });
        }else{
            setDisabled(imageView4);
        }

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

    // gray out buttom
    public void setDisabled(ImageView imageView) {
        final ColorMatrix grayscaleMatrix = new ColorMatrix();
        grayscaleMatrix.setSaturation(0);
        imageView.setColorFilter(new ColorMatrixColorFilter(grayscaleMatrix));
        imageView.setEnabled(true);
    }
}