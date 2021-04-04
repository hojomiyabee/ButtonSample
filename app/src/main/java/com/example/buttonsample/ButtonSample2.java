package com.example.buttonsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ButtonSample2 extends AppCompatActivity
        implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_sample2);
        findViewById(R.id.imageButton2).setOnClickListener(this);
    }

    public void onClick(View view){
        Intent intent2 = new Intent(ButtonSample2.this, MainActivity.class);
        startActivity(intent2);
    }
}