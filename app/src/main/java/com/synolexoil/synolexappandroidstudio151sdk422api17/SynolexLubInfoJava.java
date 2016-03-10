package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.content.Intent;
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
public class SynolexLubInfoJava extends Fragment {

    public SynolexLubInfoJava() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_synolex_lub_info_java, container, false);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/IRANSansMobile_Light.ttf");
        TextView txt10 = (TextView) v.findViewById(R.id.textView10);

        Button btn5 = (Button) v.findViewById(R.id.button5);
        Button btn6 = (Button) v.findViewById(R.id.button6);
        Button btn7 = (Button) v.findViewById(R.id.button7);
        Button btn8 = (Button) v.findViewById(R.id.button8);

        btn5.setTypeface(font);
        btn6.setTypeface(font);
        btn7.setTypeface(font);
        btn8.setTypeface(font);

        txt10.setTypeface(font);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), RoghanMotorBenzini.class);
                startActivity(i);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), RoghanMotorCyclet.class);
                startActivity(i);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), RoghanDandehKhodroi.class);
                startActivity(i);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent i = new Intent(getActivity(), RoghanMotorDiesel.class);
            startActivity(i);

        }
    });
        return v;
    }

}
