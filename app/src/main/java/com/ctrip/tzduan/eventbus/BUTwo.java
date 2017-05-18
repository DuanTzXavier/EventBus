package com.ctrip.tzduan.eventbus;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by tzduan on 17/5/18.
 */

public class BUTwo {

    public void toast(Context context, String message, String message2){
        Toast.makeText(context, message + "" + message2, Toast.LENGTH_SHORT).show();

    }
}
