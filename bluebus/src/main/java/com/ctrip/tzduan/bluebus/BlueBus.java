package com.ctrip.tzduan.bluebus;

import android.content.Context;

import java.lang.reflect.Method;

/**
 * Created by tzduan on 17/5/18.
 */

public class BlueBus {

    private BlueBus mInstant;
    private String classPath;
    private String methodName;
    private Object[] params;
    private int mThread;

    public BlueBus getInstant(){
        if (mInstant == null){
            mInstant = new BlueBus();
        }
        mThread = BlueConstant.ON_MAIN_THREAD;
        return mInstant;
    }

    public BlueBus method(String classPath, String methodName, Object... params)  {
        this.classPath = classPath;
        this.methodName = methodName;
        this.params = params;
        return this;
    }

    private Class[] getMethodFied(Object... params){
        Class[] argsClass = new Class[params.length];
        for (int i = 0, j = params.length; i < j; i++) {
            if (params[i] instanceof Context){
                argsClass[i] = Context.class;
            }else {
                argsClass[i] = params[i].getClass();
            }
        }
        return argsClass;
    }

    public BlueMethod build() throws Exception{
        Class<?> tempClass = Class.forName(classPath);
        Method method = tempClass.getMethod(methodName, getMethodFied(params));
        return new BlueMethod(method, mThread, params);
    }


}
