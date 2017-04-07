package com.example.siddhiparekh11.temperaturehumidity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;

import android.util.Log;
/**
 * Created by siddhiparekh11 on 3/12/17.
 */

public class BroadCastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("com.example.siddhiparekh11.farmiotapp.TEMP_BROADCAST")) {

            Log.d("Debug -->", "Farm Manager request received");

             Intent i=new Intent(context,MainActivity.class);
            context.startActivity(i);

        }

    }

}
