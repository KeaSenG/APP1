package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Clicking = (Button)  findViewById(R.id.មុខវិជ្ជារូបវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( MainActivity.this,physical1.class);
                startActivity(intent);
                Toast.makeText(, "Button clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }

    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Clicking = (Button)  findViewById(R.id.មុខវិជ្ជាគីមីវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( MainActivity.this,chemistry1.class);
                startActivity(intent);
                Toast.makeText(, "Button clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Clicking = (Button)  findViewById(R.id.មុខវិជ្ជាជីវៈវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( MainActivity.this,Biology1.class);
                startActivity(intent);
                Toast.makeText(, "Button clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Clicking = (Button)  findViewById(R.id.មុខវិជ្ជាផែនដីវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( MainActivity.this,Geology1.class);
                startActivity(intent);
                Toast.makeText(, "Button clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Clicking = (Button)  findViewById(R.id.មុខវិជ្ជាគណិតវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( MainActivity.this,Mathematics1.class);
                startActivity(intent);
                Toast.makeText(, "Button clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Clicking = (Button)  findViewById(R.id. វិទ្យាសាស្រ្ដកុំព្យូទ័)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Computer1.class);
                startActivity(intent);
                Toast.makeText(, "Button clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Clicking = (Button)  findViewById(R.id.មុខវិជ្ជាអង់គ្លេស)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( MainActivity.this,English1.class);
                startActivity(intent);
                Toast.makeText(, "Button clicked", Toast.LENGTH_SHORT).show();// is how to make toast
            }
        });
    }
}