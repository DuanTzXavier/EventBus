package com.ctrip.tzduan.eventbus;

import android.content.Context;

import java.lang.reflect.Method;

/**
 * Created by tzduan on 17/5/18.
 */

public class EventBus {

    public static void invokeMethod(String packageName, String methodName, Object... params){
        try {
            Class<?> getclass = Class.forName(packageName);
            Class[] argsClass = new Class[params.length];
            for (int i = 0, j = params.length; i < j; i++) {
                if (params[i] instanceof Context){
                    argsClass[i] = Context.class;
                }else {
                    argsClass[i] = params[i].getClass();
                }
            }
//            argsClass[0] = Context.class;
            Method startSamsungPay = getclass.getMethod(methodName, argsClass);
            startSamsungPay.invoke(getclass.newInstance(), params);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
