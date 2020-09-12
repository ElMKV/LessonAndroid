package com.example.emptyactivityforlessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH.mm.ss");
        String time = simpleDateFormat.format(new Date(System.currentTimeMillis()));

        TextView textViewTime = (TextView)findViewById(R.id.textViewTime);
        textViewTime.setText(time);
    }
}