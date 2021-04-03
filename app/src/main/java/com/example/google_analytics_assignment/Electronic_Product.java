package com.example.google_analytics_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Electronic_Product extends AppCompatActivity {
    Button bntLap;
    Button btnPhone;
    Button btnTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic__product);

        bntLap = findViewById(R.id.bntLap);
        btnPhone = findViewById(R.id.btnPhone);
        btnTV = findViewById(R.id.btnTV);

        bntLap.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(Electronic_Product.this,Det_LHP.class);
                startActivity(i);
            }
        });

        btnPhone.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(Electronic_Product.this,Det_I12PM.class);
                startActivity(i);
            }
        });

        btnTV.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(Electronic_Product.this,Det_STV.class);
                startActivity(i);
            }
        });
    }
}