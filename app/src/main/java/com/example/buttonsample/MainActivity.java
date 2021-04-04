package com.example.buttonsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton home;
    private ImageButton search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = (ImageButton) findViewById(R.id.imageButton7);
        search = (ImageButton) findViewById(R.id.imageButton3);

        home.setOnClickListener(this::onClick);
        search.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageButton7:
            Intent intent = new Intent(MainActivity.this, ButtonSample2.class);
            startActivity(intent);
            break;
            case R.id.imageButton3:
            Intent intent2 = new Intent(MainActivity.this, ButtonSample4.class);
            startActivity(intent2);
            break;
        }
    }
}