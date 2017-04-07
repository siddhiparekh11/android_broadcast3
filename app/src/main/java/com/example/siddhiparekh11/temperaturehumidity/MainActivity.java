package com.example.siddhiparekh11.temperaturehumidity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.util.Log;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSet(View v)
    {
        String temp, humidity;
        EditText ed1=(EditText) findViewById(R.id.edit_temperature);
        EditText ed2=(EditText) findViewById(R.id.edit_humidity);
        temp=ed1.getText().toString();
        humidity=ed2.getText().toString();
         Log.d("Debug-->",humidity);
        if(temp!=null && humidity!=null)
        {
            Intent sendTemp=new Intent("com.example.siddhiparekh11.temperaturehumidity.TEMPRES_BROADCAST");
            sendTemp.putExtra("tempValue",temp);
            sendTemp.putExtra("humidValue",humidity);
            sendBroadcast(sendTemp);
        }
    }
    public void onCancel(View v)
    {
       EditText e1=(EditText)findViewById(R.id.edit_temperature);
        EditText e2=(EditText)findViewById(R.id.edit_humidity);
        e1.setText("");
        e2.setText("");
    }


    public void onFinish(View v)
    {
        this.finish();
    }
}
