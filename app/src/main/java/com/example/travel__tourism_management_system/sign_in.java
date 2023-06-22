package com.example.travel__tourism_management_system;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.travel__tourism_management_system.databinding.ActivitySignInBinding;
import com.example.travel__tourism_management_system.databinding.ActivitySignUpBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class sign_in extends AppCompatActivity {
    ActivitySignInBinding binding;
    private FirebaseAuth auth;
    FirebaseDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();


        binding.loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



               if(!binding.username.getText().toString().isEmpty() && !binding.password.getText().toString().isEmpty()){
                   auth.signInWithEmailAndPassword(binding.username.getText().toString(),binding.password.getText().toString())
                           .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                               @Override
                               public void onComplete(@NonNull Task<AuthResult> task) {
                                   if(task.isSuccessful()){
                                       Intent intent = new Intent(sign_in.this, districts.class);
                                       startActivity(intent);
                                   }
                                   else {
                                       Toast.makeText(sign_in.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                                   }
                               }
                           });
               }
               else{

               }

            }
        });
        binding.backsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUp = new Intent(sign_in.this, sign_up.class);
                startActivity(signUp);
                finish();
            }
        });


        }
    }

