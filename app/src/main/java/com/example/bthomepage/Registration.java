package com.example.bthomepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static android.content.ContentValues.TAG;

import java.util.Calendar;

//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {

    private EditText userName, userPassword, userEmail;
    private Button regButton;
    private TextView userLogin;
    private FirebaseAuth auth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

    }

    public void sendMessageReg(View view) {
        userPassword = (EditText)findViewById(R.id.etUserPassword);
        userEmail = (EditText)findViewById(R.id.etUserEmail);
        regButton = (Button)findViewById(R.id.btnRegister);

        String userID;
        String userPasswordString = userPassword.getText().toString();
        String userEmailString = userEmail.getText().toString();

        if (userPasswordString.isEmpty() || userEmailString.isEmpty()){
            Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show();
        }else if (userPasswordString.length() < 6){
            Toast.makeText(this, "Password too short", Toast.LENGTH_SHORT).show();

        }
        else {
            auth = FirebaseAuth.getInstance();
            registerUser(userEmailString, userPasswordString);
            Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show();

            userID = auth.getCurrentUser().getUid();
            FirebaseFirestore fstore = FirebaseFirestore.getInstance();
            DocumentReference documentReference = fstore.collection("users").document(userID);
            Map<String, Object> user = new HashMap<>();
            user.put("email", userEmailString);
            user.put("name", userEmailString);
            user.put("uid", userID);
            Log.d(TAG, "userid = " + userID);
//          user.put("completedExerciseDates", Calendar.getInstance().getTime());

            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void unused) {
                    Log.d(TAG, "onSuccess: user Profile is created for " + userID);
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NotNull Exception e) {
                    Log.d(TAG, "onFailure: " + e.toString());
                }
            });

            Log.d(TAG, "onSuccess: user Profile is created for " + userID);

            Intent intent = new Intent(Registration.this, HomePage.class);
            startActivity(intent);
            finish();
        }
    }

    private void registerUser(String userEmail, String userPassword) {




        auth.createUserWithEmailAndPassword(userEmail, userPassword).addOnCompleteListener(Registration.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(Registration.this, "Registration successful!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Registration.this, "Please enter all details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void sendMessageOldLogin(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        userLogin = (TextView)findViewById(R.id.tvUserLogin);
        startActivity(intent);


    }

//    private Boolean validate(){
//        Boolean result = false;
//
//        String name = userName.getText().toString();
//        String password = userPassword.getText().toString();
//        String email = userEmail.getText().toString();
//
//        if(name.isEmpty() || password.isEmpty() || email.isEmpty()){
//            Toast.makeText(this, "Please enter all the details", Toast.LENGTH_SHORT).show();
//        }
//        else{
//            result = true;
//        }
//
//        return result;
//    }
}
