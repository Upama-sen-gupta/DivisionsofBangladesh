package com.example.divisionsofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnBarishal,btnCtg,btnDhaka,btnKhulna,btnMymen,btnRajshahi,btnRangpur,btnSylhet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnBarishal=findViewById(R.id.btn_barishal);
        btnCtg=findViewById(R.id.btn_ctg);
        btnDhaka=findViewById(R.id.btn_dhaka);
        btnKhulna=findViewById(R.id.btn_khulna);
        btnMymen=findViewById(R.id.btn_mymen);
        btnRajshahi=findViewById(R.id.btn_rajshahi);
        btnRangpur=findViewById(R.id.btn_rangpur);
        btnSylhet=findViewById(R.id.btn_sylhet);

        btnBarishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("division","barishal");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Barishal", Toast.LENGTH_SHORT).show();
            }
        });

        btnCtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("division","chittagong");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Chittagong", Toast.LENGTH_SHORT).show();
            }
        });

        btnDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("division","dhaka");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Dhaka", Toast.LENGTH_SHORT).show();
            }
        });

        btnKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("division","khulna");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Khulna", Toast.LENGTH_SHORT).show();
            }
        });

        btnMymen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("division","mymensingh");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Mymensingh", Toast.LENGTH_SHORT).show();
            }
        });

        btnRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("division","rajshahi");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Rajshahi", Toast.LENGTH_SHORT).show();
            }
        });

        btnRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("division","rangpur");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Rangpur", Toast.LENGTH_SHORT).show();
            }
        });

        btnSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("division","sylhet");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Sylhet", Toast.LENGTH_SHORT).show();
            }
        });











    }
}