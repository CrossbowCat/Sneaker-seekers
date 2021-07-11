package com.example.sneakerseekersv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {                                                           /* Declaring VAR's for register from with _register at the back to know what it reference too */
    private TextView banner, registerUser;
    private EditText editUsername_register, editEmail_register, editPassword_register, editRePassword_register;
    private ProgressBar progressbar_register;


    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mAuth = FirebaseAuth.getInstance();
    }
}