package com.example.google_analytics_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Clothes_Product extends AppCompatActivity {
    Button btnTC;
    Button btnCC;
    Button btnGC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes__product);

        btnTC = findViewById(R.id.btnTC);
        btnCC = findViewById(R.id.btnCC);
        btnGC = findViewById(R.id.btnGC);

        btnTC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(Clothes_Product.this,Det_TC.class);
                startActivity(i);
            }
        });

        btnCC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(Clothes_Product.this,Det_CC.class);
                startActivity(i);
            }
        });

        btnGC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(Clothes_Product.this,Det_GC.class);
                startActivity(i);
            }
        });
    }
}