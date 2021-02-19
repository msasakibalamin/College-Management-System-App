package com.example.collageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplasnScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splasn_screen);

        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    Intent intern = new Intent(SplasnScreen.this,MainActivity.class);
                    startActivity(intern);
                    finish();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }


}