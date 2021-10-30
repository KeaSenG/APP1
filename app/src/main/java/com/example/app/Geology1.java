package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Geology1 extends AppCompatActivity {

    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geology1);

        Clicking = ( Button)  findViewById(R.id.មេរៀនផែនដីវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Geology1.this, lessonGs1.class);
                startActivity(intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geology1);

        Clicking = ( Button)  findViewById(R.id.ឯកសារពិសោធន៍gs)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Geology1.this, experiment_gs1.class);
                startActivity(intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geology1);

        Clicking = ( Button)  findViewById(R.id.វីដេអូពិសោធន៍ផែនដីវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Geology1.this, video_gs1.class);
                startActivity(intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geology1);

        Clicking = ( Button)  findViewById(R.id.តេស្តផែនដីវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( Geology1.this, test_gs1.class);
                startActivity(intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
}