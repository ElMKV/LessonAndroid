package com.example.emptyactivityforlessons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextText);
        button = (Button) findViewById(R.id.buttonSub);

        button.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {


        Intent intent = new Intent(this, ViewActivity.class);

        intent.putExtra("name", editText.getText().toString());


        startActivity(intent);


    }
}