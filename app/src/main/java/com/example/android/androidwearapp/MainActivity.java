package com.example.android.androidwearapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.CardFragment;
import android.widget.TextView;

public class MainActivity extends WearableActivity {
    private TextView mTextView;
//    int counter = 0;
//
//    public void plusOne(View view) {
//        counter++;
//        mTextView.setText(Integer.toString(counter));
//    }
//
//    public void reset(View view) {
//        counter = 0;
//        mTextView.setText(Integer.toString(counter));
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mTextView = (TextView) findViewById(R.id.mTextView);

        // Enables Always-on
        setAmbientEnabled();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        CardFragment cardFragment = CardFragment.create("Hello Rob", "How are you doing?", android.R.drawable.btn_dialog);


        fragmentTransaction.add(R.id.frame_layout, cardFragment);
        fragmentTransaction.commit();

    };


}
