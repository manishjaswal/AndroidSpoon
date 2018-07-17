package com.example.manishjaswal.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.processor.MyEvent;

public class MainActivity extends AppCompatActivity {

   @MyEvent(event = "test")
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
