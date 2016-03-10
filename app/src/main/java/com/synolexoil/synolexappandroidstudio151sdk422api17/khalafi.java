package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class khalafi extends Fragment {


    public khalafi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final Button btnSendSMS;
        final EditText txtCarNo;



        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_khalafi, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/IRANSansMobile_Light.ttf");

        TextView textView9 = (TextView) v.findViewById(R.id.textView9);
        TextView textView15 = (TextView) v.findViewById(R.id.textView15);
        Button button14 = (Button) v.findViewById(R.id.button14);

        button14.setTypeface(font);
        textView9.setTypeface(font);
        textView15.setTypeface(font);

        btnSendSMS = (Button) v.findViewById(R.id.button14);
        txtCarNo = (EditText) v.findViewById(R.id.editText19);


        btnSendSMS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String txtFieldCarNo = txtCarNo.getText().toString();
                String RahvarPoliceNo = "09132763643";
                Log.e("sssssss", "aaaaaaaa");
                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(RahvarPoliceNo, null, txtFieldCarNo, null, null);
                    Toast.makeText(getContext(), "پاسخ بزودی به شما پیامک می شود.", Toast.LENGTH_LONG).show();
                }

                catch (Exception e) {
                    Toast.makeText(getContext(), "ارسال موفقیت آمیز نبود. لطفا مجددا تلاش کنید.", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        return v;
    }

    protected void sendSMSMessage() {

    }

}
