package com.semenindonesia.insp.inspection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

/**
 * Created by agungxfz on 20/03/2017.
 */

public class splash extends Activity{
    private ProgressBar spinner;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        spinner=(ProgressBar)findViewById(R.id.progressBar);
        spinner.setVisibility(View.VISIBLE);

        Thread timer = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                } finally {
                    Intent myIntent = new Intent(splash.this, login.class);
                    startActivity(myIntent);
                }
            }
        };

        timer.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}
