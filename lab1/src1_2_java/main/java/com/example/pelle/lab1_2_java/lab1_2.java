package com.example.pelle.lab1_2_java;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.os.*;


public class lab1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout  layout_1 = new LinearLayout (this);
        LinearLayout  layout_2 = new LinearLayout (this);
        layout_1.setOrientation(LinearLayout.VERTICAL);
        layout_2.setOrientation(LinearLayout.VERTICAL);
        layout_1.setGravity(Gravity.CENTER_VERTICAL);
        layout_2.setGravity(Gravity.CENTER_VERTICAL);
        //sooooo efficient, seperation is king
        for(int i = 0; i < 4; ++i){
            layout_1.addView( getTextView(), getLinearLayout1Params( ));
        }

        //create textfields
        EditText textField_1 = new EditText(this);
        textField_1.setText("maybe");
        EditText textField_2 = new EditText(this);
        textField_2.setText("maybe2");
        EditText textField_email = new EditText(this);
        textField_email.setText("email@study.com");

        //add textfields
        layout_2.addView(textField_1,getLinearLayout2Params());
        layout_2.addView(textField_2,getLinearLayout2Params());
        layout_2.addView(textField_email,getLinearLayout2Params());

        //create seekbar
        SeekBar sb = new SeekBar(this);
        layout_2.addView(sb,getLinearLayout2Params());

    }

    TextView getTextView(){
        TextView tv  = new TextView(this);
        tv.setText("a textfield");
        return tv;
    }

    LinearLayout.LayoutParams getLinearLayout1Params( ){
            LinearLayout.LayoutParams layout_1_params = new LinearLayout.LayoutParams
            (
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
        return layout_1_params;
    }
    LinearLayout.LayoutParams getLinearLayout2Params( ){
        LinearLayout.LayoutParams layout_2_params = new LinearLayout.LayoutParams
                (
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        return layout_2_params;
    }
}

