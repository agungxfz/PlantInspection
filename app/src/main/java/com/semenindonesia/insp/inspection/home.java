package com.semenindonesia.insp.inspection;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by agungxfz on 20/03/2017.
 */

public class home extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ImageButton btn_scan = (ImageButton) findViewById(R.id.btn_scan);
        ImageButton btn_email = (ImageButton) findViewById(R.id.btn_email);
        ImageButton btn_report = (ImageButton) findViewById(R.id.btn_report);
        ImageButton btn_export = (ImageButton) findViewById(R.id.btn_export);
        ImageButton btn_about = (ImageButton) findViewById(R.id.btn_about);
        ImageButton btn_update = (ImageButton) findViewById(R.id.btn_update);
        ImageButton btn_logout = (ImageButton) findViewById(R.id.btn_logout);

        TextView txt_userlogin = (TextView) findViewById(R.id.txt_userlogin);

        Intent intent = getIntent();
        String loginName = intent.getStringExtra("fullname");

        txt_userlogin.setText("Welcome " + loginName);

        btn_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), act_scan.class);
                startActivity(myIntent);
            }
        });

        btn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), act_email.class);
                startActivity(myIntent);
            }
        });

        btn_export.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), act_export.class);
                startActivity(myIntent);
            }
        });

        btn_report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), act_report.class);
                startActivity(myIntent);
            }
        });

        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), act_about.class);
                startActivity(myIntent);
            }
        });

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), act_update.class);
                startActivity(myIntent);
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(home.this)
                        .setIcon(R.drawable.warning)
                        .setTitle("Exit Apps")
                        .setMessage("Anda yakin keluar aplikasi?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent myIntent = new Intent(getApplicationContext(), login.class);
                                startActivity(myIntent);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        });
    }

    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.warning)
                .setTitle("Exit Apps")
                .setMessage("Anda yakin keluar aplikasi?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent myIntent = new Intent(getApplicationContext(), login.class);
                        startActivity(myIntent);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
