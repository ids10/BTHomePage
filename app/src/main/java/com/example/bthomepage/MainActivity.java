package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.bthomepage.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, HomePage.class);
        EditText editTextUser = (EditText) findViewById(R.id.etUsername);
        EditText editTextPassword = (EditText) findViewById(R.id.etPassword);
        String username = editTextUser.getText().toString();
        String password = editTextPassword.getText().toString();

        if (username.isEmpty() || password.isEmpty()){
            Toast.makeText(MainActivity.this, "Please enter all details correctly", Toast.LENGTH_SHORT).show();
        }
        else {


            Toast.makeText(MainActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
            intent.putExtra(EXTRA_MESSAGE, username);
            startActivity(intent);
        }
    }
}
