package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class physical1 extends AppCompatActivity {

    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical1);

        Clicking = ( Button ) findViewById(R.id.មេររៀនរូបវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(physical1.this, lessonP1,class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make Toast


            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical1);

        Clicking = ( Button ) findViewById(R.id.ឯកសារពិសោធន៍P)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(physical1.this, experiment_p1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make Toast


            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical1);

        Clicking = ( Button ) findViewById(R.id.វីដេអូពិសោធន៍រូបវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(physical1.this, video_p1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make Toast


            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physical1);

        Clicking = ( Button ) findViewById(R.id.តេស្តរូបវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(physical1.this, test_p1,class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make Toast


            }
        });
    }
}