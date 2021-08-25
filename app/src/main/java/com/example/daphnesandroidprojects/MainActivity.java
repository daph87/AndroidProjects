package com.example.daphnesandroidprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Project[] projects = {
                new Project("Getting Started app", "Our very first project, the default 'Hello World' app", 5),
                new Project("BMI Calculator", "Our very second project, the default 'Hello World' app", 5),
                new Project("The hungry developer", "Our very third project, the default 'Hello World' app", 5),
        };
    }
}