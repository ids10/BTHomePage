package com.example.bthomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.bthomepage.MESSAGE";
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();

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
            loginUser(username, password);


//            Toast.makeText(MainActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
//            intent.putExtra(EXTRA_MESSAGE, username);
//            startActivity(intent);
        }
    }

    private void loginUser(String username, String password) {
        auth.signInWithEmailAndPassword(username, password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, HomePage.class));
                finish();
            }
        });
    }
}
