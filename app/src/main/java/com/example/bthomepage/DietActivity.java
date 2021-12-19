package com.example.bthomepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import org.jetbrains.annotations.NotNull;

public class DietActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);


        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.diagnosisActivity:
                        Intent intent1 = new Intent(DietActivity.this, DiagnosisActivity.class);
                        startActivity(intent1);
                        break;


                    case R.id.exerciseActivity:
                        Intent intent2 = new Intent(DietActivity.this, LungsActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.lifestyleActivity:
                        Intent intent3 = new Intent(DietActivity.this, DietActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.progressActivity:
                        Intent intent4 = new Intent(DietActivity.this, ProgressActivity.class);
                        startActivity(intent4);
                        break;

                    case R.id.settingsActivity:
                        Intent intent5 = new Intent(DietActivity.this, SettingsActivity.class);
                        startActivity(intent5);
                        break;


                }
                return true;
            }
        });

//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item){
//                switch (item.getItemId()) {
//                    case R.id.diagnosisActivity:
//                        Intent intent1 = new Intent(DietActivity.this, DiagnosisActivity.class);
//                        startActivity(intent1);
//                        break;
//
//
//                    case R.id.exerciseActivity:
//                        Intent intent2 = new Intent(DietActivity.this, LungsActivity.class);
//                        startActivity(intent2);
//                        break;
//
//                    case R.id.lifestyleActivity:
//                        Intent intent3 = new Intent(DietActivity.this, DietActivity.class);
//                        startActivity(intent3);
//                        break;
//
//                    case R.id.progressActivity:
//                        Intent intent4 = new Intent(DietActivity.this, ProgressActivity.class);
//                        startActivity(intent4);
//                        break;
//
//                    case R.id.settingsActivity:
//                        Intent intent5 = new Intent(DietActivity.this, SettingsActivity.class);
//                        startActivity(intent5);
//                        break;
//
//
//
//                }
//                return false;
//            }
//        });
//    }
//

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
        return true;
    }
}