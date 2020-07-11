package com.lskvibesltd.lskvibes;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private Handler mHandler;
    private Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRunnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        };

        mHandler=new Handler();

        mHandler.postDelayed(mRunnable,3000);

            }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mHandler!=null && mRunnable!=null)
        mHandler.removeCallbacks(mRunnable);
    }
}
