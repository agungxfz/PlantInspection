package com.semenindonesia.insp.inspection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by agungxfz on 13/04/2017.
 */

public class form_sg_rm42 extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sg_rm4_layout2);

        ImageButton btn_back = (ImageButton) findViewById(R.id.btn_back_rm42);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent();
                setResult(RESULT_OK, myIntent);
                finish();
            }
        });
    }
}
