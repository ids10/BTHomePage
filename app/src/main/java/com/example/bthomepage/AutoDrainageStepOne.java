package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AutoDrainageStepOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_drainage_step_one);
    }
    public void sendMessagesAutoStepTwo(View view) {
        Intent intent = new Intent(this, AutoDrainageStepTwo.class);
        startActivity(intent);
    }

}