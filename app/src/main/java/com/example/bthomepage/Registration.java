package com.example.bthomepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {

    private EditText userName, userPassword, userEmail;
    private Button regButton;
    private TextView userLogin;
    private FirebaseAuth auth;
//    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
//        mAuth = FirebaseAuth.getInstance();
//
//        FirebaseUser currentUser = mAuth.getCurrentUser();
//        if(currentUser != null) {
//            Intent intent = new Intent(this, MainActivity.class);
//        }
//        setupUIViews();



//        regButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(this, HomePage.class);
//                if(validate()){
                    //https://www.youtube.com/watch?v=zKBGjGoeid0
//                    String user_email = userEmail.getText().toString().trim();
//                    String user_password = userPassword.getText().toString().trim();

//                    firebaseAuth.createUserWithEmailAndPassword(user_email, user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//
//                            if(task.isSuccessful()){
//                                Toast.makeText(RegistrationActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
//                                startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
//
//                            }
//                            else{
//                                Toast.makeText(RegistrationActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
//
//                            }
//
//                        }
//                    });
//                };
            }


//        });
//
//        userLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(Registration.this, HomePage.class));
//            }
//        });
//    }

//    private void setupUIViews(){
//        userName = (EditText)findViewById(R.id.etUserName);
//        userPassword = (EditText)findViewById(R.id.etUserPassword);
//        userEmail = (EditText)findViewById(R.id.etUserEmail);
//        regButton = (Button)findViewById(R.id.btnRegister);
//        userLogin = (TextView)findViewById(R.id.tvUserLogin);
//
//    }
    public void sendMessageReg(View view) {
//        Intent intent = new Intent(this, HomePage.class);
//        userName = (EditText)findViewById(R.id.etUserName);
        userPassword = (EditText)findViewById(R.id.etUserPassword);
        userEmail = (EditText)findViewById(R.id.etUserEmail);
        regButton = (Button)findViewById(R.id.btnRegister);
        auth = FirebaseAuth.getInstance();


//        userNameString.isEmpty()

//        String userNameString = userName.getText().toString();
        String userPasswordString = userPassword.getText().toString();
        String userEmailString = userEmail.getText().toString();

        if (userPasswordString.isEmpty() || userEmailString.isEmpty()){
            Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show();
        }
        else {
//            Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show();
////            intent.putExtra(EXTRA_MESSAGE, username);
            registerUser(userEmailString, userPasswordString);
//            startActivity(intent);
        }
    }

    private void registerUser(String userEmail, String userPassword) {
        auth.createUserWithEmailAndPassword(userEmail, userPassword).addOnCompleteListener(Registration.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(Registration.this, "Registration successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Registration.this, HomePage.class);
                    startActivity(intent);

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
