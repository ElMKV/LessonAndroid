package com.example.emptyactivityforlessons;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    final int REQUEST_CODE_COLOR = 1;
    final int REQUEST_CODE_ALIGN = 2;


    TextView textView;
    Button buttonColor;
    Button buttonAlighment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        buttonAlighment = findViewById(R.id.buttonAlighment);
        buttonColor = findViewById(R.id.buttonColor);
        buttonColor.setOnClickListener(this);
        buttonAlighment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.buttonColor:
                intent = new Intent(this, ColorActivity.class);
                startActivityForResult(intent, REQUEST_CODE_COLOR);
                break;
            case R.id.buttonAlighment:
                intent = new Intent(this, AlighmentActivity.class);
                startActivityForResult(intent, REQUEST_CODE_ALIGN);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.d("myLogs", "requestCode = "+ requestCode + ", resultCode = " + resultCode);
        if(resultCode == RESULT_OK)
        {
            switch (requestCode){
                case REQUEST_CODE_COLOR:
                    int color = data.getIntExtra("color", Color.WHITE);
                    textView.setTextColor(color);
                    break;
                case REQUEST_CODE_ALIGN:
                    int align = data.getIntExtra("alighment", Gravity.LEFT);
                    textView.setGravity(align);
                    break;
            }
        }
        else {
            Toast.makeText(MainActivity.this, "Wrong result", Toast.LENGTH_SHORT).show();
        }
    }
}