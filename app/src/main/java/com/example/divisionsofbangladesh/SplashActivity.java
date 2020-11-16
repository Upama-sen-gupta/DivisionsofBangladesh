package com.example.divisionsofbangladesh;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView txtDivisionBangladesh;
    ImageView imgIcon;

    int splashTimeOut=3000; //time in mile seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        txtDivisionBangladesh=findViewById(R.id.txt_division_bamgladesh);
        imgIcon=findViewById(R.id.img_icon);

        txtDivisionBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate= AnimationUtils.loadAnimation(SplashActivity.this,R.anim.rotate);
                txtDivisionBangladesh.startAnimation(rotate);
            }
        });

        txtDivisionBangladesh.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txtDivisionBangladesh.clearAnimation();
                return true;
            }
        });



        imgIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate= AnimationUtils.loadAnimation(SplashActivity.this,R.anim.rotate);
                imgIcon.startAnimation(rotate);
            }
        });

        imgIcon.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imgIcon.clearAnimation();
                return true;
            }
        });





        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },splashTimeOut);

    }
}

