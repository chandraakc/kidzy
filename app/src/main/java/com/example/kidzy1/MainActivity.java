package com.example.kidzy1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = findViewById(R.id.buttonNext);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent moveIntent = new Intent(MainActivity.this, SpinnerActivity.class);
        startActivity(moveIntent);
    }
}
