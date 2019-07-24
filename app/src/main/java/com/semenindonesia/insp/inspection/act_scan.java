package com.semenindonesia.insp.inspection;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by agungxfz on 20/03/2017.
 */

public class act_scan extends Activity {
    public ProgressBar spinner;
    public TextView txt_equip_scan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_scan);

        spinner = (ProgressBar) findViewById(R.id.progressBar);
//        spinner.setVisibility(View.INVISIBLE);

        txt_equip_scan =  (TextView) findViewById(R.id.txt_equip_scan);
        txt_equip_scan.setVisibility(View.INVISIBLE);

        Button btn_loadform_kl41 = (Button) findViewById(R.id.btn_loadform_kl41);
        Button btn_loadform_kl42 = (Button) findViewById(R.id.btn_loadform_kl42);
        Button btn_loadform_rm41 = (Button) findViewById(R.id.btn_loadform_rm41);
        Button btn_loadform_rm42 = (Button) findViewById(R.id.btn_loadform_rm42);
        Button btn_loadform_rm43 = (Button) findViewById(R.id.btn_loadform_rm43);

        ImageButton btn_scan_equip = (ImageButton) findViewById(R.id.btn_scan_equip);

        btn_scan_equip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinner.setVisibility(View.VISIBLE);
                txt_equip_scan.setVisibility(View.VISIBLE);
            }
        });

        btn_loadform_kl41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), form_sg_kl41.class);
                startActivity(myIntent);
            }
        });

        btn_loadform_kl42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), form_sg_kl42.class);
                startActivity(myIntent);
            }
        });

        btn_loadform_rm41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), form_sg_rm41.class);
                startActivity(myIntent);
            }
        });

        btn_loadform_rm42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), form_sg_rm42.class);
                startActivity(myIntent);
            }
        });

        btn_loadform_rm43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), form_sg_rm43.class);
                startActivity(myIntent);
            }
        });
    }
}
