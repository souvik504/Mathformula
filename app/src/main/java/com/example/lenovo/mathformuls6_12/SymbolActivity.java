package com.example.lenovo.mathformuls6_12;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SymbolActivity extends AppCompatActivity{
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symbol);
        btn1=findViewById(R.id.A_s);
        btn2=findViewById(R.id.b_m_s);
        btn3=findViewById(R.id.c_a_s);
        btn4=findViewById(R.id.c_s);
        btn5=findViewById(R.id.g_s);
        btn6=findViewById(R.id.g_a_s);
        btn7=findViewById(R.id.L_a_s);
        btn8=findViewById(R.id.L_s);
        btn9=findViewById(R.id.R_s);
        btn10=findViewById(R.id.s_s);




        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(SymbolActivity.this,Algebrasymbol.class);


                startActivity(switchingIntent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(SymbolActivity.this,Basicsymbol.class);


                startActivity(switchingIntent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(SymbolActivity.this,Calcusyymbol.class);


                startActivity(switchingIntent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(SymbolActivity.this,Combinatsymbol.class);


                startActivity(switchingIntent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(SymbolActivity.this,Geometrysym.class);


                startActivity(switchingIntent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(SymbolActivity.this,Greeksymbol.class);


                startActivity(switchingIntent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(SymbolActivity.this,Linearsymbol.class);


                startActivity(switchingIntent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(SymbolActivity.this,Logicsymbol.class);


                startActivity(switchingIntent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(SymbolActivity.this,Romansybol.class);


                startActivity(switchingIntent);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchingIntent=new Intent(SymbolActivity.this,Setsymbol.class);


                startActivity(switchingIntent);
            }
        });




    }
}
