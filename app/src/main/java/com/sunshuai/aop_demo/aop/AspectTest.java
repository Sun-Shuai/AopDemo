package com.sunshuai.aop_demo.aop;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by sunshuai on 2018/4/19
 */
@Aspect
public class AspectTest {

    private final String TAG = this.getClass().getSimpleName();

    @Pointcut("execution(@com.sunshuai.aop_demo.annotations.DebugTool * *(..))")
    public void DebugToolMethod() {
    }

    @Around("DebugToolMethod()")
    public void onActivityMethodAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String key = proceedingJoinPoint.getSignature().toString();
        Log.e(TAG, "sun1: " + key);
        proceedingJoinPoint.proceed();
        Log.e(TAG, "sun2: " + key);
    }


}