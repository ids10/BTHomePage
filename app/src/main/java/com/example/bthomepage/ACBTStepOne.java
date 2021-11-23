package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ACBTStepOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acbtstep_one);
    }
    public void sendMessagesteptwoACBT(View view) {
        Intent intent = new Intent(this, ACBTStepTwo.class);
        startActivity(intent);
    }
}

