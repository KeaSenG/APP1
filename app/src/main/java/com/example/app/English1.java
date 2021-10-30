package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class English1 extends AppCompatActivity {

    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english1);

        Clicking = ( Button ) findViewById(R.id.General_e1)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(English1.this, lesson_general1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast

            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english1);

        Clicking = ( Button ) findViewById(R.id.Stem_e1)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(English1.this, lesson_Stem1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast

            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english1);

        Clicking = ( Button ) findViewById(R.id.តេស្ដE1)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(English1.this, test_e1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast

            }
        });
    }
}