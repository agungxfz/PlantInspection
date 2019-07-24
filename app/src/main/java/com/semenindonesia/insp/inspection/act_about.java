package com.semenindonesia.insp.inspection;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by agungxfz on 20/03/2017.
 */

public class act_about extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        String serviceName = Context.TELEPHONY_SERVICE;
        TelephonyManager m_telephonyManager = (TelephonyManager) getSystemService(serviceName);
        String IMEI, IMSI;
        IMEI = m_telephonyManager.getDeviceId();
        IMSI = m_telephonyManager.getSubscriberId();
        String myVersion = Build.VERSION.RELEASE;
        String manufacturer = Build.MANUFACTURER;
        String model = Build.MODEL;

        TextView txt_imei = (TextView) findViewById(R.id.txt_imei);
        TextView txt_imsi = (TextView) findViewById(R.id.txt_imsi);
        TextView txt_android = (TextView) findViewById(R.id.txt_android);
        TextView txt_battery = (TextView) findViewById(R.id.txt_battery);
        TextView txt_manufacture = (TextView) findViewById(R.id.txt_manufacture);
        TextView txt_model = (TextView) findViewById(R.id.txt_model);
        TextView txt_sdcard = (TextView) findViewById(R.id.txt_sdcard);

        Boolean isSDPresent = Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);

        ImageButton btn_back = (ImageButton) findViewById(R.id.btn_back_about);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent();
                setResult(RESULT_OK, myIntent);
                finish();
            }
        });

        if (isSDPresent) {
            txt_sdcard.setText("SD Card is available");
        } else {
            txt_sdcard.setText("Error : SD Card not available");
        }

        txt_imei.setText(IMEI);
        txt_imsi.setText(IMSI);
        txt_android.setText(myVersion);
        txt_manufacture.setText(manufacturer);
        txt_model.setText(model);
        txt_battery.setText(Float.toString(getBatteryLevel()));
    }

    public float getBatteryLevel() {
        Intent batteryIntent = registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        int level = batteryIntent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = batteryIntent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

        if (level == -1 || scale == -1) {
            return 50.0f;
        }

        return ((float) level / (float) scale) * 100.0f;
    }
}
