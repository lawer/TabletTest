package com.example.tablettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tablettest.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
}