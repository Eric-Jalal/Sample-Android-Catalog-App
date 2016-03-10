package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InsuranceExpirationReminder extends Fragment {


    public InsuranceExpirationReminder() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_insurance_expiration_reminder, container, false);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/IRANSansMobile_Light.ttf");
        TextView txt2 = (TextView) v.findViewById(R.id.textView19);
        TextView txt3 = (TextView) v.findViewById(R.id.textView14);
        TextView txt4 = (TextView) v.findViewById(R.id.textView20);
        TextView txt5 = (TextView) v.findViewById(R.id.textView21);
        TextView txt6 = (TextView) v.findViewById(R.id.textView22);
        TextView txt23 = (TextView) v.findViewById(R.id.textView24);

        Button button = (Button) v.findViewById(R.id.button13);

        txt2.setTypeface(font);
        txt3.setTypeface(font);
        txt4.setTypeface(font);
        txt5.setTypeface(font);
        txt6.setTypeface(font);
        txt23.setTypeface(font);
        button.setTypeface(font);


        return v;
    }

}
