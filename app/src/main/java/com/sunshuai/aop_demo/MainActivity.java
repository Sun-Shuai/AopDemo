package com.sunshuai.aop_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.sunshuai.aop_demo.annotations.DebugTool;

public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testAop();
    }

    @DebugTool
    private void testAop(){
        Log.e(TAG,"testaop");
    }
}
