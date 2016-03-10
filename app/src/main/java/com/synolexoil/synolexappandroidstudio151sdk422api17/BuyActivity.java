package com.synolexoil.synolexappandroidstudio151sdk422api17;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);


        Typeface typeface = Typeface.createFromAsset(getAssets(), "IRANSansMobile_Light.ttf");
        Button button11 = (Button) findViewById(R.id.button11);
        button11.setTypeface(typeface);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence text = "اطلاعات شما ثبت شد، کارشناسان ما بزودی با شما تماس خواهند گرفت.";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });
    }
}
