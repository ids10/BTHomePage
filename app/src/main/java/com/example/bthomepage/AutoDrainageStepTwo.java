package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AutoDrainageStepTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_drainage_step_two);
    }
    public void sendMessagesAutoStepThree(View view) {
        Intent intent = new Intent(this, AutoDrainageStepThree.class);
        startActivity(intent);
    }

}