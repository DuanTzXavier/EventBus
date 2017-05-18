package com.ctrip.tzduan.eventbus;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button toa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toa = (Button) findViewById(R.id.toastaaa);
        toa.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Object[] objects = new Object[2];
        Context context = getBaseContext();
        objects[0] = context;
        objects[1] = "12312312321";
        EventBus.invokeMethod("com.ctrip.tzduan.eventbus.BUOne", "toast", getBaseContext(), "12312312321");

        Object[] object1 = new Object[1];
        object1[0] = "12312312321";
        EventBus.invokeMethod("com.ctrip.tzduan.eventbus.BUOne", "log1", object1);
    }
}
