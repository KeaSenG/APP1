package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class chemistry1 extends AppCompatActivity {

    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry1);

        Clicking = ( Button ) findViewById(R.id.មេរៀនគីមីវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( chemistry1.this, lesson_c1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry1);

        Clicking = ( Button ) findViewById(R.id.ឯកសារពិសោធន៍c)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( chemistry1.this, experimentC1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry1);

        Clicking = ( Button ) findViewById(R.id.វីដេអូពិសោធន៍គីមីវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( chemistry1.this, video_c1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry1);

        Clicking = ( Button ) findViewById(R.id.តេស្តគីមីវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( chemistry1.this, testC1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
}
