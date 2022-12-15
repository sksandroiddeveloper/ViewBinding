package com.sks.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sks.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding mainxml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
mainxml=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainxml.getRoot());
 mainxml.textview1.setText("I am Sks");
    }
}