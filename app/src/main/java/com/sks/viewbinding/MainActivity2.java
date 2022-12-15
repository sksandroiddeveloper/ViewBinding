package com.sks.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sks.viewbinding.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
ActivityMain2Binding xml2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        xml2 = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(xml2.getRoot());
        xml2.textview1.setText("I aM HERO ");

    }
}