package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Computer1 extends AppCompatActivity {

    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer1);

        Clicking = ( Button ) findViewById(R.id.មេរៀនCode_org)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Computer1.this, code_org.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer1);

        Clicking = ( Button ) findViewById(R.id.website1)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Computer1.this, website1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer1);

        Clicking = ( Button ) findViewById(R.id.App1)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Computer1.this, APP1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
}