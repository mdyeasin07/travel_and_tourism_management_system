package com.example.travel__tourism_management_system;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.travel__tourism_management_system.databinding.ActivitySignUpBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import Models.User;

public class sign_up extends AppCompatActivity {
    ActivitySignUpBinding binding;
    private FirebaseAuth auth;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();


        binding.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!binding.email.getText().toString().isEmpty() && !binding.user1.getText().toString().isEmpty() && !binding.pass1.getText().toString().isEmpty() && !binding.repass1.getText().toString().isEmpty())
                {
                    auth.createUserWithEmailAndPassword(binding.email.getText().toString(), binding.pass1.getText().toString())
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(task.isSuccessful())
                                    {
                                        User user = new User(binding.user1.getText().toString(),binding.email.getText().toString(),binding.pass1.getText().toString());
                                        String id = task.getResult().getUser().getUid();
                                        database.getReference().child("user").child(id).setValue(user);
                                        Toast.makeText(sign_up.this, "sing up successfully", Toast.LENGTH_SHORT).show();

                                    }
                                    else{
                                        Toast.makeText(sign_up.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
                else{
                    Toast.makeText(sign_up.this, "Enter credentials", Toast.LENGTH_SHORT).show();
                }
            }

        });

        binding.backsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(), sign_in.class);
                startActivity(intent3);
            }
        });
    }
}




