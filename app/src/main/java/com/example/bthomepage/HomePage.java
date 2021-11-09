package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Toast.makeText(HomePage.this, "Login successful!", Toast.LENGTH_SHORT).show();


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
//        TextView textView = findViewById(R.id.tvDiagnosis);
//        textView.setText(message);

        ImageView imgClick;
        imgClick = (ImageView)findViewById(R.id.imgDiagnosis);
        Intent intentdiagnosis = new Intent(this, Exercises.class);
        imgClick.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v)
            {
//                Toast.makeText(HomePage.this, "You clicked on ImageView", Toast.LENGTH_LONG).show();
                startActivity(intentdiagnosis);
            } }); } }

