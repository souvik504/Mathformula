package com.example.lenovo.mathformuls6_12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ZoomControls;

public class Algebrasymbol extends AppCompatActivity {
    ImageView image;
    ZoomControls zit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebrasymbol);
        image=findViewById(R.id.i_1);

    }
}
