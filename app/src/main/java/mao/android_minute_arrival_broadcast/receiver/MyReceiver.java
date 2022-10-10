package mao.android_minute_arrival_broadcast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Date;

public class MyReceiver extends BroadcastReceiver
{
    /**
     * 标签
     */
    private static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        if (!intent.getAction().equals(Intent.ACTION_TIME_TICK))
        {
            return;
        }
        Log.i(TAG, "onReceive: 收到分钟到达广播：" + new Date());
    }
}