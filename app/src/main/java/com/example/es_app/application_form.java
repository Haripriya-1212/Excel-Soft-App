package com.example.es_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class application_form extends AppCompatActivity {

    String[] loc={"Select","Mysore","Chennai","Bangalore" ,"Hyderabad"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_form);

        Spinner spin = (Spinner) findViewById(R.id.sp1);



        ArrayAdapter ad1=new ArrayAdapter(getApplicationContext(),R.layout.spinner,loc);
        ad1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(ad1);
    }
}