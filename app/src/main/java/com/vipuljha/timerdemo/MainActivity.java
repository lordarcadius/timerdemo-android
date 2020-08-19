package com.vipuljha.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.d("Hey there!", "I am logging.");
                handler.postDelayed(this, 1000);
            }
        };

        handler.post(runnable);*/
        new CountDownTimer(10000, 1000){
            public void onTick(long millisecondsUntilDone){
                Log.i("Second left: ", String.valueOf(millisecondsUntilDone/1000));
            }

            public void onFinish(){
                Log.i("Alert: ", "We are done!");
            }
        }.start();
    }
}