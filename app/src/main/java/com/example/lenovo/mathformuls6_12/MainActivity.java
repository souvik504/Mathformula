package com.example.lenovo.mathformuls6_12;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView formulacard,symbolcard,aboutcard,geometrycard,unitcard,equcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        formulacard=(CardView)findViewById(R.id.formula_card);
        symbolcard=(CardView)findViewById(R.id.symbol_card);
        geometrycard=(CardView) findViewById(R.id.geo_card);
        unitcard=(CardView) findViewById(R.id.unit_card);
        equcard=(CardView) findViewById(R.id.eq_card);
        aboutcard=(CardView) findViewById(R.id.about_card);
        formulacard.setOnClickListener(this);
        symbolcard.setOnClickListener(this);
        geometrycard.setOnClickListener(this);
        unitcard.setOnClickListener(this);
        equcard.setOnClickListener(this);
        aboutcard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
         switch (v.getId())
         {
             case R.id.formula_card : i=new Intent(this,FirstActivity.class);startActivity(i);break;
             case R.id.symbol_card : i=new Intent(this,SymbolActivity.class);startActivity(i);break;

             case R.id.geo_card: i=new Intent(this,Geom.class);startActivity(i);break;
             case R.id.unit_card: i=new Intent(this,Unit.class);startActivity(i);break;
             case R.id.eq_card: i=new Intent(this,Equ.class);startActivity(i);break;
             case R.id.about_card: i=new Intent(this,About.class);startActivity(i);break;
             default: break;
         }

    }
}
