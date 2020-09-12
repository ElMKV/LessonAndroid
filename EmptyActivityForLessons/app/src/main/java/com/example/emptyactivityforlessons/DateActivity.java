package com.example.emptyactivityforlessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);


        TextView textViewDate = (TextView) findViewById(R.id.textViewDate);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String data = simpleDateFormat.format(new Date(System.currentTimeMillis()));

        textViewDate.setText(data);


    }
}