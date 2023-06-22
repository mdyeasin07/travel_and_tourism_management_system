package com.example.travel__tourism_management_system;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chondronath extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chondronath);

        b1 = findViewById(R.id.about_p6);
        b2 = findViewById(R.id.hotel6);
        b3 = findViewById(R.id.transport6);
        b4 = findViewById(R.id.about_us6);
        b5 = findViewById(R.id.back50);
        b6 = findViewById(R.id.map15);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(chondronath.this, chondronath_about.class);
                startActivity(B1);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2 = new Intent(chondronath.this, chondronath_hotel.class);
                startActivity(B2);
                finish();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B3 = new Intent(chondronath.this, chondronath_transport.class);
                startActivity(B3);
                finish();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B4 = new Intent(chondronath.this, chondronath_about_us.class);
                startActivity(B4);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("geo:0,0?q=Chandranath Hill, Chittagong, Sitakund");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B5 = new Intent(chondronath.this, ctg_places.class);
                startActivity(B5);
                finish();
            }
        });
    }
}
