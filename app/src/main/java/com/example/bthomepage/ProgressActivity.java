package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProgressActivity extends AppCompatActivity {
    int minteger = 0;
    int minteger1 = 0;
    int minteger2 = 0;
    int minteger3 = 0;
    int minteger4 = 0;
    int minteger5 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
    }
    public void increaseInteger(View view) {
        minteger = minteger + 1;
        display(minteger);

    }public void decreaseInteger(View view) {
        minteger = minteger - 1;
        display(minteger);
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number);
        displayInteger.setText("" + number);
    }

    public void increaseInteger1(View view) {
        minteger1 = minteger1 + 1;
        display1(minteger1);

    }public void decreaseInteger1(View view) {
        minteger1 = minteger1 - 1;
        display1(minteger1);
    }

    private void display1(int number1) {
        TextView displayInteger1 = (TextView) findViewById(
                R.id.integer_number1);
        displayInteger1.setText("" + number1);
    }

    public void increaseInteger2(View view) {
        minteger2 = minteger2 + 1;
        display2(minteger2);

    }public void decreaseInteger2(View view) {
        minteger2 = minteger2 - 1;
        display2(minteger2);
    }

    private void display2(int number2) {
        TextView displayInteger2 = (TextView) findViewById(
                R.id.integer_number2);
        displayInteger2.setText("" + number2);
    }

    public void increaseInteger3(View view) {
        minteger3 = minteger3 + 1;
        display3(minteger3);

    }public void decreaseInteger3(View view) {
        minteger3 = minteger3 - 1;
        display3(minteger3);
    }

    private void display3(int number3) {
        TextView displayInteger3 = (TextView) findViewById(
                R.id.integer_number3);
        displayInteger3.setText("" + number3);
    }

    public void increaseInteger4(View view) {
        minteger4 = minteger4 + 1;
        display4(minteger4);

    }public void decreaseInteger4(View view) {
        minteger4 = minteger4 - 1;
        display4(minteger4);
    }

    private void display4(int number4) {
        TextView displayInteger4 = (TextView) findViewById(
                R.id.integer_number4);
        displayInteger4.setText("" + number4);
    }

    public void increaseInteger5(View view) {
        minteger5 = minteger5 + 1;
        display5(minteger5);

    }public void decreaseInteger5(View view) {
        minteger5 = minteger5 - 1;
        display5(minteger5);
    }

    private void display5(int number5) {
        TextView displayInteger5 = (TextView) findViewById(
                R.id.integer_number5);
        displayInteger5.setText("" + number5);
    }

    public void sendMessageCalendar(View view) {
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }



}