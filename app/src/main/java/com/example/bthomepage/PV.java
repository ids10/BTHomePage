package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pv);
    }
    public void sendMessagesOptionsPV(View view) {
        Intent intent = new Intent(this, OptionsPV.class);
        startActivity(intent);
    }

}