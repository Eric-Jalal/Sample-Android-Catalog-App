package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.content.Intent;
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
public class Callus extends Fragment {


    public Callus() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_callus, container, false);

        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/IRANSansMobile_Light.ttf");

        TextView textView16 = (TextView) v.findViewById(R.id.textView16);
        TextView textView17 = (TextView) v.findViewById(R.id.textView18);
        EditText editText8 = (EditText) v.findViewById(R.id.editText8);
        final EditText editText16 = (EditText) v.findViewById(R.id.editText16);
        final EditText editText18 = (EditText) v.findViewById(R.id.editText18);

        Button btnSendMail = (Button) v.findViewById(R.id.btnSendMail);

        textView16.setTypeface(font);
        textView17.setTypeface(font);
        editText8.setTypeface(font);
        editText16.setTypeface(font);
        editText18.setTypeface(font);
        btnSendMail.setTypeface(font);


        final EditText editText = (EditText) v.findViewById(R.id.editText8);
        Button button = (Button) v.findViewById(R.id.btnSendMail);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"crm@synolexoil.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,editText16.getText().toString());
                intent.putExtra(Intent.EXTRA_EMAIL,editText18.getText().toString());
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"لطفا یک اکانت ایمیل انتخاب کنید."));
            }
        });


        return v;
    }

}
