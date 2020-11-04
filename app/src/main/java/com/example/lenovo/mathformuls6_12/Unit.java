package com.example.lenovo.mathformuls6_12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Unit extends AppCompatActivity {

        TextView textview;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_unit);
            textview=findViewById(R.id.a_12);
        }
    }