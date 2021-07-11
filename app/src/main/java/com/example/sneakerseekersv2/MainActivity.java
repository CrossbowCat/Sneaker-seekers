package com.example.sneakerseekersv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 private TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = (TextView) findViewById(R.id.txtRegister);               /*Set on click listener for txtRegistration*/
        register.setOnClickListener(this);


    }
    @Override                                                       /*Override to switch to registratoin form*/
    public void onClick(View v){
        switch(v.getId()){
            case R.id.txtRegister:
                startActivity(new Intent(this,Registration.class));
                break;

        }
    }
}