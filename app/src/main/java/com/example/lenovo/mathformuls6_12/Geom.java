package com.example.lenovo.mathformuls6_12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Geom extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geom);
        btn1=findViewById(R.id.d_s);
        btn2=findViewById(R.id.b_s);
        btn3=findViewById(R.id.c_s);
        btn4=findViewById(R.id.a_s);
        btn5=findViewById(R.id.g_s);
        btn6=findViewById(R.id.e_s);
        btn7=findViewById(R.id.m_s);
        btn8=findViewById(R.id.L_s);
        btn9=findViewById(R.id.r_s);
        btn10=findViewById(R.id.S_s);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(Geom.this,D_1.class);


                startActivity(switchingIntent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(Geom.this,D_2.class);


                startActivity(switchingIntent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(Geom.this,D_3.class);


                startActivity(switchingIntent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(Geom.this,D_4.class);


                startActivity(switchingIntent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(Geom.this,D_5.class);


                startActivity(switchingIntent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(Geom.this,D_6.class);


                startActivity(switchingIntent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(Geom.this,D_7.class);


                startActivity(switchingIntent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(Geom.this,D_8.class);


                startActivity(switchingIntent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(Geom.this,D_9.class);


                startActivity(switchingIntent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(Geom.this,D_10.class);


                startActivity(switchingIntent);
            }
        });




    }
    }

