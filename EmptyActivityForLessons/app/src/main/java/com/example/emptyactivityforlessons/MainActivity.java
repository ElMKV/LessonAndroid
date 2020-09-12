package com.example.emptyactivityforlessons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonTime = (Button) findViewById(R.id.buttonTime);
        Button buttonDate = (Button) findViewById(R.id.buttonDate);

        buttonTime.setOnClickListener(this);
        buttonDate.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case R.id.buttonTime:
                intent = new Intent("info.fandeoid.intent.action.time");
                startActivity(intent);
                break;
            case R.id.buttonDate:
                intent = new Intent("info.fandeoid.intent.action.date");
                startActivity(intent);
                break;
        }
    }
}