package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AutoDrainage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_drainage);
    }
    public void sendMessageAutoSteps(View view) {
        Intent intent = new Intent(this, AutoDrainageStepOne.class);
        startActivity(intent);
    }

}