package com.example.emptyactivityforlessons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity становится видимым");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity получает фокус");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity преостановлено");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity остановлено");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity уничтожено ");

    }
}