package com.synolexoil.synolexappandroidstudio151sdk422api17;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SynoLubeSearchJava extends Fragment {


    public SynoLubeSearchJava() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_syno_lube_search_java, container, false);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/IRANSansMobile_Light.ttf");
        TextView txt7 = (TextView) v.findViewById(R.id.textView7);
        TextView txt8 = (TextView) v.findViewById(R.id.textView8);


        Button btn4 = (Button) v.findViewById(R.id.button4);

        btn4.setTypeface(font);

        txt7.setTypeface(font);
        txt8.setTypeface(font);


        String [] CarsModelLube = {

                "DIACO 5W-30/40 SN – BWM -بی ام و",
                "DIACO 5W-30/40 SN – Benz-بنز",
                "DIACO 5W-30/40 SN – Lexus - لکسوس",
                "DIACO 5W-30/40 SN – Mitsubishi -میتسوبیشی",
                "DIACO 5W-30/40 SN - Renault -  -رنو –",
                "DIACO 5W-30/40 SN - MG - ام جی",
                "DIACO 5W-30/40 SN - 2008 آلفا رومئو از سال",
                "DIACO 5W-30/40 SN - 2010 هیوندای سوناتا از",
                "DIACO 5W-30/40 SN - Genesis - جنسیس",
                "DIACO 5W-30/40 SN - Santafe - سانتافه",
                "DIACO 5W-30/40 SN - Tuscan - توسان",
                "DIACO 5W-30/40 SN - Azera -آزرا",
                "DIACO 5W-30/40 SN - IX55 - IX35 - I30 - هیوندای",
                "DIACO 5W-30/40 SN - تویوتا ماتریکس",
                "DIACO 5W-30/40 SN - 2010 – Corolla تویوتا کرول",
                "DIACO 5W-30/40 SN - Yaris یاریس ",
                "DIACO 5W-30/40 SN - Camry کمری",
                "DIACO 5W-30/40 SN - Land Cruiser لند کروزر",
                "DIACO 5W-30/40 SN - Toyota Fj - تویوتا اف جی",
                "DIACO 5W-30/40 SN - 2010 هوندا آکورد از",
                "DIACO 5W-30/40 SN - هوندا سیویک",
                "- کیا موهاوی - KIA Mohave - DIACO 5W-30/40 SN",
                "- کیا اپتیما - KIA Optima - DIACO 5W-30/40 SN",
                "- سورنتو – Sorento - DIACO 5W-30/40 SN",
                "- کادنزا – Cadenza - DIACO 5W-30/40 SN",
                "- اپیروس – Opirus - DIACO 5W-30/40 SN",
                "- اسپورتیج – Sportage - DIACO 5W-30/40 SN",
                "- سول مدل های بعد از 2010 - DIACO 5W-30/40 SN",
                "- رنو لاگونا کوپه از 2010 - DIACO 5W-30/40 SN",
                "- پورشه کاین از 2010 - DIACO 5W-30/40 SN",
                "- نیسان تیانا - Nissan TEANA - DIACO 5W-30/40 SN",
                "- قشقایی – Qashqai - DIACO 5W-30/40 SN",
                "- ماکسیما اتوماتیک و دنده ای - DIACO 5W-30/40 SN",
                "- مورانو – Murano - DIACO 5W-30/40 SN",
                "- سانگ یانگ کایرون - DIACO 5W-30/40 SN",
                "- سوزوکی گراند ویتارا – Vitara - DIACO 5W-30/40 SN",
                "- سرانزا – Seranza - ARIAS 10W-40/50 SM",
                "- جک - J3 G5 S5 - ARIAS 10W-40/50 SM",
                "- پژو 407 - ARIAS 10W-40/50 SM",
                "- سانگ یانگ 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- سوناتا مدل های 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- جنسیس مدل های 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- سانتافه مدل های 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- آزرا - Azera - مدل های 2006 تا  -2010 - ARIAS 10W-40/50 SM",
                "- I30 - IX55 - IX35 مدل های 2006 تا  -2010 ARIAS 10W-40/50 SM",
                "- کیا سول مدل های 2008 تا 2010 - ARIAS 10W-40/50 SM",
                "- تویوتا مدل های 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- کمری مدل های 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- لندکروزر - Land Cruiser - ARIAS 10W-40/50 SM",
                "- کرولا از 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- یاریس از 2006 تا 2010 – Yaris - ARIAS 10W-40/50 SM",
                "- اپتیما - Optima - مدل های 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- موهاوی - Mohave - مدل های 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- کادنزا - Cadenza - 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- اسپورتیج - Sportage - مدل های 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- اپیروس - Opirus - 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- نیسان تیانا - Nissan TEANA - 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- قشقایی - Qashqai - مدل های 2006 تا 2010 - ARIAS 10W-40/50 SM",
                "- پراید گروه X100 شامل 131 141 111 132 - ARIAS 10W-40/50 SM",
                "- ام وی ام 110 ARIAS 10W-40/50 SM",
                "- سمند - ARIAS 10W-40/50 SL",
                "- پژو 405 GLX - ARIAS 10W-40/50 SL",
                "- پژو 206 تیپ 2 - ARIAS 10W-40/50 SL",
                "- ماکسیما - Maxima - قبل از 2006 - ARIAS 10W-40/50 SL",
                "- سوزوکی ویتارا - Vitara - قبل از 2006 - ARIAS 10W-40/50 SL",
                "- تویوتا هایلوکس – HiLux - ARIAS 10W-40/50 SL",
                "- زانتیا - Xantia - ARIAS 10W-40/50 SL",
                "- پاجرو – Pajero - ARIAS 10W-40/50 SL",
                "- ماتیز - ARIAS 10W-40/50 SL",
                "- وانت بار - ARIAS 10W-40/50 SL",
                "- ماکسیما – Maxima - ARIAS 10W-40/50 SL",
                "- سمند سریر - ARIAS 10W-40/50 SL",
                "- سمند XL - ARIAS 10W-40/50 SL",
                "- جیلی ام گراند - Geely Emgrand - ARIAS 10W-40/50 SL",
                "- وانت نیسان - ARIAS 10W-40/50 SL",
                "- لیفان 520i – Lifan - ARIAS 10W-40/50 SL",
                "- Lifan X60 - لیفان  ARIAS 10W-40/50 SL",
                "- هیوندای آوانته اتوماتیک – Avante - ARIAS 10W-40/50 SL",
                "- هیوندای ورنا – Verna - ARIAS 10W-40/50 SL",
                "- ریو – Rio - ARIAS 10W-40/50 SL",
                "- مزدا 323 - ARIAS 10W-40/50 SL",
                "- پروتون GEN2 - ARIAS 10W-40/50 SL",
                "- پروتون ویه را - ARIAS 10W-40/50 SL",
                "- سورن ELX - ARIAS 10W-40/50 SL",
                "- خودروهای جدید تولیدی گروه رنو: مگان - ARIAS 10W-40/50 SL",
                "- رنو لوگان - ARIAS 10W-40/50 SL",
                "- تندر 90 - ARIAS 10W-40/50 SL",
                "- ام جی - ARIAS 10W-40/50 SL",
                "- ام وی ام 315 - ARIAS 10W-40/50 SL",
                "- پژو های 206 - ARIAS 10W-40/50 SL",
                "- پژو 407 - ARIAS 10W-40/50 SL",
                "- رانا - ARIAS 10W-40/50 SL",
                "- دنا - ARIAS 10W-40/50 SL",
                "- ام وی ام 530 - ARIAS 10W-40/50 SL",
                "- ریو جدید - ARIAS 10W-40/50 SL",
                "- تیبا - ARIAS 10W-40/50 SL",
                "- پژو پارس  - ARIAS 10W-40/50 SL",
                "- پارس تندر - ARIAS 10W-40/50 SL",
                "- دنا - ARIAS 20W-50 SG",
                "- دنا - RONAK 20W-50 SG",
                "- دنا - TAXI 20W-50 SG",
                "- پراید - ARIAS 20W-50 SG",
                "- پراید - RONAK 20W-50 SG",
                "- پراید - TAXI 20W-50 SG",
                "- نسیم - ARIAS 20W-50 SG",
                "- نسیم - RONAK 20W-50 SG",
                "- نسیم - TAXI 20W-50 SG",
                "- صبا - ARIAS 20W-50 SG",
                "- صبا - RONAK 20W-50 SG",
                "- صبا - TAXI 20W-50 SG",
                "- پی کی - ARIAS 20W-50 SG",
                "- پی کی - RONAK 20W-50 SG",
                "- پی کی - TAXI 20W-50 SG",
                "- دوو - ARIAS 20W-50 SG",
                "- دوو - RONAK 20W-50 SG",
                "- دوو - TAXI 20W-50 SG",
                "- رنو 21 - ARIAS 20W-50 SG",
                "- رنو 21 - RONAK 20W-50 SG",
                "- رنو 21 - TAXI 20W-50 SG",
                "- پاترول - ARIAS 20W-50 SG",
                "- پاترول - RONAK 20W-50 SG",
                "- پاترول - TAXI 20W-50 SG",
                "- پیکان - ARIAS 20W-50 SG",
                "- پیکان - RONAK 20W-50 SG",
                "- پیکان - TAXI 20W-50 SG",
                "- پژو RD - ARIAS 20W-50 SG",
                "- پژو RD - RONAK 20W-50 SG",
                "- پژو RD - TAXI 20W-50 SG"

        };

        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) v.findViewById(R.id.spinner);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_dropdown_item_1line, CarsModelLube);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

        return v;
    }
}


