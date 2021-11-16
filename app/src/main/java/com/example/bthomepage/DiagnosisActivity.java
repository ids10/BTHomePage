package com.example.bthomepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DiagnosisActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

//            bottomNavigationView = findViewById(R.id.bottomNav_view);
//            bottomNavigationView.setOnItemSelectedListener(this);

    }
    public void sendMessageCOPD(View view) {
        Intent intent = new Intent(this, COPDDescript.class);
        startActivity(intent);
    }

    public void sendMessageCF(View view) {
        Intent intent = new Intent(this, CFDescript.class);
        startActivity(intent);
    }
    public void sendMessageCB(View view) {
        Intent intent = new Intent(this, CBDescript.class);
        startActivity(intent);
    }
    public void sendMessageAsthma(View view) {
        Intent intent = new Intent(this, AsthmaDescript.class);
        startActivity(intent);
    }



//        DiagnosisActivity diagnosisactivity = new DiagnosisActivity();
//        LungsActivity lungsactivity = new LungsActivity();
//        DietActivity dietactivity = new DietActivity();
//        ProgressActivity progressactivity = new ProgressActivity();
//        SettingsActivity settingsactivity = new SettingsActivity();

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//        switch (item.getItemId()) {
//            case R.id.diagnosisActivity:
//                getSupportParentActivityIntent().replace(R.id.container, diagnosisactivity).commit();
//                return true;
//
//            case R.id.home:
//                getSupportFragmentManager().beginTransaction().replace(R.id.container, secondFragment).commit();
//                return true;
//
//            case R.id.settings:
//                getSupportFragmentManager().beginTransaction().replace(R.id.container, thirdFragment).commit();
//                return true;
//        }
//        return false;
//    }


    }
