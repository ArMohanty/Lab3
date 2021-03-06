package com.example.localadmin.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class StartActivity extends AppCompatActivity {

    final String ACTIVITY_NAME = "StartActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Log.i(ACTIVITY_NAME, "In onCreate()");
    }
    protected void onResume()
    {
        super.onResume();

        Log.i(ACTIVITY_NAME, "In onResume()");
    }
    protected void onStart()
    {
        super.onStart();

        Log.i(ACTIVITY_NAME, "In onStart()");
    }
    protected void onPause()
    {
        super.onPause();

        Log.i(ACTIVITY_NAME, "In onPause()");
    }
    protected void onStop()
    {
        super.onStop();

        Log.i(ACTIVITY_NAME, "In onStop()");

    }
    protected void onDestroy()
    {
        super.onDestroy();

        Log.i(ACTIVITY_NAME, "In onDestroy()");

    }
}
