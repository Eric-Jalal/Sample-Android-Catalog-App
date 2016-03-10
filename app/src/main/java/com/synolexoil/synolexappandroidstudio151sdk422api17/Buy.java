package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Buy extends Fragment {


    public Buy() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_buy, container, false);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "IRANSansMobile_Light.ttf");

        TextView textView17 = (TextView) v.findViewById(R.id.textView17);
        EditText editText9 = (EditText) v.findViewById(R.id.editText13);
        EditText editText10 = (EditText) v.findViewById(R.id.editText17);
        EditText editText11 = (EditText) v.findViewById(R.id.editText23);
        EditText editText12 = (EditText) v.findViewById(R.id.editText24);
        Button button11 = (Button) v.findViewById(R.id.button11);

        textView17.setTypeface(font);
        editText9.setTypeface(font);
        editText10.setTypeface(font);
        editText11.setTypeface(font);
        editText12.setTypeface(font);
        button11.setTypeface(font);




        return v;

    }

}
