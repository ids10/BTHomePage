package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class drainpos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drainpos);
    }
    public void sendMessagesOptionsDrainPos(View view) {
        Intent intent = new Intent(this, OptionsDrainPos.class);
        startActivity(intent);
    }

}