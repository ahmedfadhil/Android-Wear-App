package com.example.android.androidwearapp;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends WearableActivity {
    private TextView mTextView;
    int counter = 0;

    public void plusOne(View view) {
        counter++;
        mTextView.setText(Integer.toString(counter));
    }

    public void reset(View view) {
        counter = 0;
        mTextView.setText(Integer.toString(counter));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.mTextView);

        // Enables Always-on
        setAmbientEnabled();
    }
}
