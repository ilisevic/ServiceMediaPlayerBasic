package com.boilerplatecode.servicemediaplayerbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart=findViewById(R.id.btn_start_service);
        btnStop= findViewById(R.id.btn_stop_service);

        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == btnStart)
        {
            startService(new Intent(this, SoundService.class));
        }

        else if (v==btnStop)
        {

            stopService(new Intent(this, SoundService.class));
        }



    }
}
