package com.example.lab7_8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class BatteryReceiver extends BroadcastReceiver {
    TextView textView;
    public BatteryReceiver(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int level = intent.getIntExtra("level", 0);
        if (level != 0) {
            textView.setText(level + "%");
        }

        if (level < 20) {
            Toast.makeText(context, "Nivelul bateriei este scazut", Toast.LENGTH_LONG).show();
        }
    }
}
