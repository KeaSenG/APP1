package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mathematics1 extends AppCompatActivity {

    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics1);

        Clicking = ( Button ) findViewById(R.id.មេរៀនគណិតវិទ្យ1)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mathematics1.this, lesson_m1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast

            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics1);

        Clicking = ( Button ) findViewById(R.id.អំពីគណិតវិទ្យា1)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mathematics1.this, about_m1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast

            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics1);

        Clicking = ( Button ) findViewById(R.id.ឯកសារទាក់ទងគណិតវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mathematics1.this, experiment_m1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast

            }
        });
    }
    Button Clicking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics1);

        Clicking = ( Button ) findViewById(R.id.តេស្តគណិតវិទ្យា)

        Clicking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Mathematics1.this, test_m1.class);
                startActivity(Intent);
                Toast.makeText(, "Button Clicked", Toast.LENGTH_SHORT).show();// is how to make toast

            }
        });
    }
}