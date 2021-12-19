package com.example.bthomepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.database.FirebaseDatabase;

import android.widget.ImageView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class HomePage extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.diagnosisActivity:
                        Intent intent1 = new Intent(HomePage.this, DiagnosisActivity.class);
                        startActivity(intent1);
                        break;


                    case R.id.exerciseActivity:
                        Intent intent2 = new Intent(HomePage.this, LungsActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.homeActivity:
                        Intent intent3 = new Intent(HomePage.this, HomePage.class);
                        startActivity(intent3);
                        break;

                    case R.id.progressActivity:
                        Intent intent4 = new Intent(HomePage.this, ProgressActivity.class);
                        startActivity(intent4);
                        break;

                    case R.id.settingsActivity:
                        Intent intent5 = new Intent(HomePage.this, SettingsActivity.class);
                        startActivity(intent5);
                        break;


                }
                return false;
            }
        });

        Toast.makeText(HomePage.this, "Login successful!", Toast.LENGTH_SHORT).show();


        ImageView imgClickDiagnosis;
        imgClickDiagnosis = (ImageView)findViewById(R.id.imgDiagnosis);
        Intent intentdiagnosis = new Intent(this, DiagnosisActivity.class);
        imgClickDiagnosis.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            {
//                Toast.makeText(HomePage.this, "You clicked on ImageView", Toast.LENGTH_LONG).show();
                startActivity(intentdiagnosis);
            } });

        ImageView imgClickLungs;
        imgClickLungs = (ImageView)findViewById(R.id.imgLungs);
        Intent intentlungs = new Intent(this, LungsActivity.class);
        imgClickLungs.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            {
//                Toast.makeText(HomePage.this, "You clicked on ImageView", Toast.LENGTH_LONG).show();
                startActivity(intentlungs);
            } });

        ImageView imgClickDiet;
        imgClickDiet = (ImageView)findViewById(R.id.imgDiet);
        Intent intentdiet = new Intent(this, DietActivity.class);
        imgClickDiet.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            {
//                Toast.makeText(HomePage.this, "You clicked on ImageView", Toast.LENGTH_LONG).show();
                startActivity(intentdiet);
            } });
        ImageView imgClickProgress;
        imgClickProgress = (ImageView)findViewById(R.id.imgProgress);
        Intent intentprogress = new Intent(this, ProgressActivity.class);
        imgClickProgress.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            {
//                Toast.makeText(HomePage.this, "You clicked on ImageView", Toast.LENGTH_LONG).show();
                startActivity(intentprogress);
            } });

        ImageView imgClickSettings;
        imgClickSettings = (ImageView)findViewById(R.id.imgSettings);
        Intent intentsettings = new Intent(this, SettingsActivity.class);
        imgClickSettings.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            {
//                Toast.makeText(HomePage.this, "You clicked on ImageView", Toast.LENGTH_LONG).show();
                startActivity(intentsettings);
            } });

        ImageView imgClickFaq;
        imgClickFaq = (ImageView)findViewById(R.id.imgFaq);
        Intent intentfaq = new Intent(this, FaqActivity.class);
        imgClickFaq.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            {
//                Toast.makeText(HomePage.this, "You clicked on ImageView", Toast.LENGTH_LONG).show();
                startActivity(intentfaq);
            } });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
        return false;
    }

}




