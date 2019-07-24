package com.semenindonesia.insp.inspection;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by agungxfz on 21/03/2017.
 */

public class act_update extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_update);

        Button btn_sync_user = (Button) findViewById(R.id.btn_sync_user);
        Button btn_sync_equip = (Button) findViewById(R.id.btn_sync_equip);
        Button btn_sync_data = (Button) findViewById(R.id.btn_sync_data);

        btn_sync_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Synchronizing data...", Toast.LENGTH_SHORT);
            }
        });

        btn_sync_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Synchronizing table user...", Toast.LENGTH_SHORT);
            }
        });

        btn_sync_equip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Synchronizing table equipment...", Toast.LENGTH_SHORT);
            }
        });
    }
}
