package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SettingsActivity extends AppCompatActivity {
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        logout = findViewById(R.id.logout);

    }
    public void sendMessageLogOut (View view){
        FirebaseAuth.getInstance().signOut();
        Toast.makeText(SettingsActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(SettingsActivity.this, Registration.class));
    }
}