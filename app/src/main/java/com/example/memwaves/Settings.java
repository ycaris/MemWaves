package com.example.memwaves;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Settings extends AppCompatActivity implements ProfileDialog.ProfileDialogListener {


    private TextView textEmail;
    private TextView textName;
    private Button update;
    private Button upload;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //change user name
        textEmail = (TextView) findViewById(R.id.textView);
        textName = (TextView) findViewById(R.id.textView2);
        update = (Button) findViewById(R.id.button);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openDialog();
            }
        });

        //back to main page
        back = (ImageView) findViewById(R.id.back_page);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Settings.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //upload image
        upload = (Button) findViewById(R.id.button2);
        upload.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Settings.this, UploadImage.class);
                startActivity(intent);
            }
        });

    }

    private void openDialog(){
        ProfileDialog profileDialog = new ProfileDialog();
        profileDialog.show(getSupportFragmentManager(),"Profile Dialog");
    }

    @Override
    public void applyTexts(String username, String email){
        textEmail.setText(email);
        textName.setText(username);
    }
}