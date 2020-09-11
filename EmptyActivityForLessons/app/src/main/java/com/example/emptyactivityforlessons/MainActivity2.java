package com.example.emptyactivityforlessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {


    String TAG = "LifeCycle";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "MainActivity2 onCreate");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "MainActivity2 onRestart");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "MainActivity2 onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "MainActivity2 onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "MainActivity2 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "MainActivity2 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "MainActivity2 onDestroy ");

    }


}