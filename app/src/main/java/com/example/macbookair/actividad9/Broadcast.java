package com.example.macbookair.actividad9;

import android.Manifest;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Broadcast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
        ActivityCompat.requestPermissions(Broadcast.this, new String[]{Manifest.permission.RECEIVE_SMS}, 1);
    }

}
