package com.example.emptyactivityforlessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColorActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonRed;
    Button buttonGreen;
    Button buttonBlue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);



        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);

        buttonRed.setOnClickListener(this);
        buttonGreen.setOnClickListener(this);
        buttonBlue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.buttonRed:
                intent.putExtra("color", Color.RED);
                break;
            case R.id.buttonGreen:
                intent.putExtra("color", Color.GREEN);
                break;
            case R.id.buttonBlue:
                intent.putExtra("color", Color.BLUE);
                break;

        }
        setResult(RESULT_OK, intent);
        finish();


    }
}