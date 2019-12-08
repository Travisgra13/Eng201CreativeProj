package com.code.deity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView popul;
    private ImageView works;
    private ImageView genesis;
    private ImageView enuma;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Questions.class);
                startActivity(intent);
            }
        });
        popul = findViewById(R.id.popul);
        popul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Popul Vuh", Toast.LENGTH_SHORT).show();
            }
        });
        works = findViewById(R.id.works);
        works.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Works and Days", Toast.LENGTH_SHORT).show();
            }
        });
        genesis = findViewById(R.id.genesis);
        genesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Genesis", Toast.LENGTH_SHORT).show();
            }
        });
        enuma = findViewById(R.id.enuma);
        enuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Enuma Elish", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
