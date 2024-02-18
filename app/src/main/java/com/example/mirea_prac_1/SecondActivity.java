package com.example.mirea_prac_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        String input_message = i.getStringExtra("extra_message");
        ((TextView)findViewById(R.id.textView)).setTextSize(40);
        ((TextView)findViewById(R.id.textView)).setText(input_message);
    }


}