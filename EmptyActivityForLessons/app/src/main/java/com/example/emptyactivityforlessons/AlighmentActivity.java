package com.example.emptyactivityforlessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class AlighmentActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonLeft;
    Button buttonCenter;
    Button buttonRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alighment);

        buttonLeft=(Button)findViewById(R.id.buttonLeft);
        buttonCenter=(Button)findViewById(R.id.buttonCenter);
        buttonRight=(Button)findViewById(R.id.buttonRight);

        buttonLeft.setOnClickListener(this);
        buttonCenter.setOnClickListener(this);
        buttonRight.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.buttonLeft:
                intent.putExtra("alighment", Gravity.LEFT);
                break;
            case R.id.buttonCenter:
                intent.putExtra("alighment", Gravity.CENTER);
                break;
            case R.id.buttonRight:
                intent.putExtra("alighment", Gravity.RIGHT);
                break;
        }
        setResult(RESULT_OK, intent);
        finish();

    }
}