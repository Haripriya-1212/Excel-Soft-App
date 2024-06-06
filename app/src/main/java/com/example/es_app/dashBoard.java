package com.example.es_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class dashBoard extends AppCompatActivity {

    ImageView it,design,finance,education,marketing,law;
    RelativeLayout applications;
    LinearLayout job1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        it = findViewById(R.id.it_icon);
        design = findViewById(R.id.design_icon);
        finance = findViewById(R.id.finance_icon);
        education = findViewById(R.id.education_icon);
        marketing = findViewById(R.id.marketing_icon);
        law = findViewById(R.id.law_icon);
        applications = findViewById(R.id.applications);

        job1 = findViewById(R.id.job1);

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(dashBoard.this, it_jobs.class);
                startActivity(i1);
            }
        });

        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(dashBoard.this, design_jobs.class);
                startActivity(i2);
            }
        });

        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(dashBoard.this, finance_jobs.class);
                startActivity(i3);
            }
        });

        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(dashBoard.this, education_jobs.class);
                startActivity(i4);
            }
        });

        marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5 = new Intent(dashBoard.this, marketing_jobs.class);
                startActivity(i5);
            }
        });

        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6 = new Intent(dashBoard.this, law_jobs.class);
                startActivity(i6);
            }
        });



        job1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_j1 = new Intent(dashBoard.this, job1_des.class);
                startActivity(i_j1);
            }
        });


        applications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_a = new Intent(dashBoard.this,com.example.es_app.applications.class);
                startActivity(i_a);
            }
        });
    }


}