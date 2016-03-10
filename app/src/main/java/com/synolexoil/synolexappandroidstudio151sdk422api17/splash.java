package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            public void run() {

                finish();

                Intent intent = new Intent(splash.this,
                        MainActivity.class);
                startActivity(intent);

            }

        }, 4000);

    }

}
