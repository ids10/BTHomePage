package com.example.bthomepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.widget.ImageView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Toast.makeText(HomePage.this, "Login successful!", Toast.LENGTH_SHORT).show();







        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottomNav_view);

//        bottomNavigationView.setOnNavigationItemSelectedListener(
//                new BottomNavigationView.OnNavigationItemSelectedListener() {
//                    @Override
//                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                        switch (item.getItemId()) {
//                            case R.id.diagnosisActivity:
//
//                            case R.id.lungsActivity:
//
//                            case R.id.settingsActivity:
//
//                            case R.id.progressActivity:
//                            case R.id.dietActivity:
//
//                        }
//                        return true;
//                    }
//                });
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

//        DiagnosisActivity diagnosisactivity = new DiagnosisActivity();


//        bottomNavigationView.setOnNavigationItemSelectedListener(this);
//        bottomNavigationView.setSelectedItemId(R.id.diagnosisActivity);

        // Capture the layout's TextView and set the string as its text
//        TextView textView = findViewById(R.id.tvDiagnosis);
//        textView.setText(message);

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

    } }

