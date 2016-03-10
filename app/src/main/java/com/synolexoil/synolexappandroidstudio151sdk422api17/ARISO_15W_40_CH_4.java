package com.synolexoil.synolexappandroidstudio151sdk422api17;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ARISO_15W_40_CH_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ariso_15_w_40__ch_4);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "IRANSansMobile_Light.ttf");

        Button button3 = (Button) findViewById(R.id.button3);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView12 = (TextView) findViewById(R.id.textView12);
        TextView textView13 = (TextView) findViewById(R.id.textView13);

        textView2.setTypeface(typeface);
        textView12.setTypeface(typeface);
        textView13.setTypeface(typeface);

        button3.setTypeface(typeface);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ARISO_15W_40_CH_4.this, BuyActivity.class);
                startActivity(intent);

            }
        });
    }
}
