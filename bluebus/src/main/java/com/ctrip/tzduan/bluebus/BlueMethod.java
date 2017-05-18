package com.ctrip.tzduan.bluebus;

import java.lang.reflect.Method;

/**
 * Created by tzduan on 17/5/18.
 */

public class BlueMethod{
    private Method mMethod;
    private int mThread;
    private Object[] mParams;

    public BlueMethod(Method method, int thread, Object[] params){
        mMethod = method;
        mThread = thread;
        mParams = params;
    }

    private void invokeMethod(){

        switch (mThread){
            case BlueConstant.ON_MAIN_THREAD:
                break;
            case BlueConstant.ON_UI_THREAD:
                break;
            case BlueConstant.ON_NEW_THREAD:
                break;
            default:
                //do-nothing
        }
    }

    public void invoke(){
        invokeMethod();
    }

}
