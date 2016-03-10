package com.synolexoil.synolexappandroidstudio151sdk422api17;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ARISO_SAE_50_CD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ariso__sae_50__cd);

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

                Intent intent = new Intent(ARISO_SAE_50_CD.this, BuyActivity.class);
                startActivity(intent);

            }
        });
    }
}
