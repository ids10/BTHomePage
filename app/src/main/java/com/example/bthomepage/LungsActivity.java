package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LungsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lungs);
        

    }
    public void sendMessagePLBreathing(View view) {
        Intent intent = new Intent(this, PLBreathing.class);
        startActivity(intent);
    }
    public void sendMessageACBT(View view) {
        Intent intent = new Intent(this, ACBT.class);
        startActivity(intent);
    }
    public void sendMessageAutoDrainage(View view) {
        Intent intent = new Intent(this, AutoDrainage.class);
        startActivity(intent);
    }
    public void sendMessageDiaphram(View view) {
        Intent intent = new Intent(this, Diaphram.class);
        startActivity(intent);
    }
    public void sendMessagePV(View view) {
        Intent intent = new Intent(this, PV.class);
        startActivity(intent);
    }
    public void sendMessagedrainpos(View view) {
        Intent intent = new Intent(this, drainpos.class);
        startActivity(intent);
    }

}