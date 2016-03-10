package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by a.hosseini on 1/23/2016.
 */

public class Login extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //main activity initialized by the command up here

        // Edit Texts and buttons that are used with fonts or introduced here for further customizations
        EditText editText = (EditText) findViewById(R.id.editText);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        EditText editText3 = (EditText) findViewById(R.id.editText3);
        EditText editText4 = (EditText) findViewById(R.id.editText4);
        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);

        // Typeface has been initialized
        Typeface typeface = Typeface.createFromAsset(getAssets(), "IRANSansMobile_Light.ttf");

        //edit text Alignment set to right
        editText.setGravity(Gravity.RIGHT);
        editText2.setGravity(Gravity.RIGHT);
        editText3.setGravity(Gravity.RIGHT);
        editText4.setGravity(Gravity.RIGHT);

        //edit text Typeface uses IRANIANSANS fonts
        editText.setTypeface(typeface);
        editText2.setTypeface(typeface);
        editText3.setTypeface(typeface);
        editText4.setTypeface(typeface);

        // Buttons typeface uses IRANIANSANS fonts
        button.setTypeface(typeface);
        button2.setTypeface(typeface);

        // Navigation via Buttons
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(Login.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
}