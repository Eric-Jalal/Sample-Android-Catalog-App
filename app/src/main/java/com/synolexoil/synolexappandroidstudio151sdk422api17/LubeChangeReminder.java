package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class LubeChangeReminder extends Fragment {


    public LubeChangeReminder() {
        // Required empty public constructor
    }

/*    CalendarTool calendarTool = new CalendarTool();*/

@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle     savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_lube_change_reminder, container, false);

    Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/IRANSansMobile_Light.ttf");
       TextView txt2 = (TextView) v.findViewById(R.id.textView2);
       TextView txt3 = (TextView) v.findViewById(R.id.textView3);
       TextView txt4 = (TextView) v.findViewById(R.id.textView4);
       TextView txt5 = (TextView) v.findViewById(R.id.textView5);
       TextView txt6 = (TextView) v.findViewById(R.id.textView6);
       TextView txt23 = (TextView) v.findViewById(R.id.textView23);


       Button btn = (Button) v.findViewById(R.id.button3);

/*    int iranianyear;
    iranianyear = calendarTool.getIranianYear();
    TextView txt14 = (TextView) v.findViewById(R.id.textView14);
    txt14.setText(iranianyear);*/

       btn.setTypeface(font);
       txt2.setTypeface(font);
       txt3.setTypeface(font);
       txt4.setTypeface(font);
       txt5.setTypeface(font);
       txt6.setTypeface(font);
       txt23.setTypeface(font);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Toast.makeText(getActivity(), "اطلاعات شما ثبت شد.",
                    Toast.LENGTH_LONG).show();
        }
    });






    return v;
    }



}
