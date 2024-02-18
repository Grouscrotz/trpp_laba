package com.example.mirea_prac_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = ((EditText)findViewById(R.id.edittext)).getText().toString();
        intent.putExtra("extra_message",message);
        startActivity(intent);

    }




    }


