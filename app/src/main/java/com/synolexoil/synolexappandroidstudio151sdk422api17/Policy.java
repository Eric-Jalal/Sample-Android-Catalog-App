package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Policy extends Fragment {


    public Policy() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_policy, container, false);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/IRANSansMobile_Light.ttf");

        TextView textView25 = (TextView) v.findViewById(R.id.textView25);
        TextView textView26 = (TextView) v.findViewById(R.id.textView26);
        TextView textView27 = (TextView) v.findViewById(R.id.textView27);

        textView25.setTypeface(font);
        textView26.setTypeface(font);
        textView27.setTypeface(font);

        return v;

    }

}
