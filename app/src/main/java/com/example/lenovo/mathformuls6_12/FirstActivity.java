package com.example.lenovo.mathformuls6_12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);
        btn1=findViewById(R.id.cls_6);
        btn2=findViewById(R.id.cls_7);
        btn3=findViewById(R.id.cls_8);
        btn4=findViewById(R.id.cls_9_10);
        btn5=findViewById(R.id.cls_11_12);
        btn6=findViewById(R.id.c_1);
        btn7=findViewById(R.id.c_2);
        btn8=findViewById(R.id.c_3);
        btn9=findViewById(R.id.c_4);
        btn10=findViewById(R.id.c_5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(FirstActivity.this,Class6.class);


                startActivity(switchingIntent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(FirstActivity.this,Class7.class);


                startActivity(switchingIntent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(FirstActivity.this,Class8.class);


                startActivity(switchingIntent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(FirstActivity.this,Class910.class);


                startActivity(switchingIntent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(FirstActivity.this,Class1112.class);


                startActivity(switchingIntent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(FirstActivity.this,C_1.class);


                startActivity(switchingIntent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(FirstActivity.this,C_2.class);


                startActivity(switchingIntent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(FirstActivity.this,C_3.class);


                startActivity(switchingIntent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(FirstActivity.this,C_4.class);


                startActivity(switchingIntent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(FirstActivity.this,C_5.class);


                startActivity(switchingIntent);
            }
        });
    }
}
