package com.synolexoil.synolexappandroidstudio151sdk422api17;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ARIAS_10W_40_SM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arias_10_w_40__sm);


        Typeface typeface = Typeface.createFromAsset(getAssets(), "IRANSansMobile_Light.ttf");
        Button button3 = (Button) findViewById(R.id.button3);
        TextView textView11 = (TextView) findViewById(R.id.textView11);
        TextView textView12 = (TextView) findViewById(R.id.textView12);
        textView11.setTypeface(typeface);
        textView12.setTypeface(typeface);
        button3.setTypeface(typeface);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ARIAS_10W_40_SM.this, BuyActivity.class);
                startActivity(intent);

            }
        });
    }
}
