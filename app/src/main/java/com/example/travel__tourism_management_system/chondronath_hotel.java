package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chondronath_hotel extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chondronath_hotel);

        b1 = findViewById(R.id.back21);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back8 = new Intent(chondronath_hotel.this, chondronath.class);
                startActivity(back8);
                finish();
            }
        });
    }
}