package com.example.google_analytics_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food_Product extends AppCompatActivity {
       Button btn1;
       Button btn2;
       Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__product);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(Food_Product.this,Det_Food.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(Food_Product.this,Det_FoodCH.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(Food_Product.this,Det_F.class);
                startActivity(i);
            }
        });
    }
}