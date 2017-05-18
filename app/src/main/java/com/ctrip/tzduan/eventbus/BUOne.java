package com.ctrip.tzduan.eventbus;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by tzduan on 17/5/18.
 */

public class BUOne {

    public static void toast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void log1(String message){
        Log.i("event bus log", message);
    }
}
