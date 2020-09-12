package com.example.emptyactivityforlessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        textView =(TextView)findViewById(R.id.textViewExstra);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        textView.setText(name);


    }
}