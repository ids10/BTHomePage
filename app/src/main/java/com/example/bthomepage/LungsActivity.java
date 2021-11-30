package com.example.bthomepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LungsActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lungs);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){
                switch (item.getItemId()) {
                    case R.id.diagnosisActivity:
                        Intent intent1 = new Intent(LungsActivity.this, DiagnosisActivity.class);
                        startActivity(intent1);
                        break;


                    case R.id.exerciseActivity:
                        Intent intent2 = new Intent(LungsActivity.this, LungsActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.lifestyleActivity:
                        Intent intent3 = new Intent(LungsActivity.this, DietActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.progressActivity:
                        Intent intent4 = new Intent(LungsActivity.this, ProgressActivity.class);
                        startActivity(intent4);
                        break;

                    case R.id.settingsActivity:
                        Intent intent5 = new Intent(LungsActivity.this, SettingsActivity.class);
                        startActivity(intent5);
                        break;



                }
                return false;
            }
        });
//        bottomNavigationView.setSelectedItemId(R.id.person);
        

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

    @Override
    public boolean onNavigationItemSelected(@NonNull @org.jetbrains.annotations.NotNull MenuItem item) {
        return false;
    }
}