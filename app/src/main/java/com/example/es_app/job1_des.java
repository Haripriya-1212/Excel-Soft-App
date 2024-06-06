package com.example.es_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class job1_des extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job1_des);
    }

    public void button(View view) {
        Intent intent = new Intent(job1_des.this, application_form.class);
        startActivity(intent);
    }
}