package com.example.emptyactivityforlessons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonCall;
    Button buttonWeb;
    Button buttonMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCall = findViewById(R.id.buttonCall);
        buttonMap = findViewById(R.id.buttonMap);
        buttonWeb = findViewById(R.id.buttonWeb);

        buttonWeb.setOnClickListener(this);
        buttonMap.setOnClickListener(this);
        buttonCall.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent intent;

        switch (view.getId()) {
            case R.id.buttonWeb:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mmbyte.com/article/8117.html"));
                startActivity(intent);
                break;
            case R.id.buttonMap:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:-0.45609946, -90.2611607513"));
                startActivity(intent);
                break;
            case R.id.buttonCall:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:12345"));
                startActivity(intent);
                break;
        }

    }
}