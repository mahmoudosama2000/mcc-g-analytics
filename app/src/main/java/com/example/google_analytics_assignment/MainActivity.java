package com.example.google_analytics_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    long userInteractionTime = 0;
    Button btnFood;
    Button btnClothes;
    Button btnElectronic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        long unixTime = System.currentTimeMillis() / 1000L;
//        super.onUserInteraction();
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        selectContent("a123", "dog", "image");

        xEvent("a12345","xName");

        trackScreen("main screen");

        btnFood = findViewById(R.id.btnFood);
        btnClothes = findViewById(R.id.btnClothes);
        btnElectronic = findViewById(R.id.btnElectronic);

        btnFood.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(MainActivity.this,Food_Product.class);
                startActivity(i);
            }
        });

        btnClothes.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(MainActivity.this,Clothes_Product.class);
                startActivity(i);
            }
        });
        btnElectronic.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(MainActivity.this,Electronic_Product.class);
                startActivity(i);
            }
        });
    }

    void selectContent(String id,String name,String contentType){
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, contentType);
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }

    void trackScreen(String screenName){
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.SCREEN_NAME, screenName);
        bundle.putString(FirebaseAnalytics.Param.SCREEN_CLASS, "MainActivity");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle);
    }

    void xEvent(String id, String name){
        Bundle xEventBundle = new Bundle();
        xEventBundle.putString("id", id);
        xEventBundle.putString("name", name);
        mFirebaseAnalytics.logEvent("xEvent", xEventBundle);
    }

    @Override
    public void onUserInteraction() {
        userInteractionTime = System.currentTimeMillis();
        super.onUserInteraction();
        Log.i("appname","Interaction");
    }

    @Override
    public void onUserLeaveHint() {
        long uiDelta = (System.currentTimeMillis() - userInteractionTime);

        super.onUserLeaveHint();
        if (uiDelta < 100)
            Log.i("appname","Home Key Pressed");
        else
            Log.i("appname","We are leaving, but will probably be back shortly!");
    }
}