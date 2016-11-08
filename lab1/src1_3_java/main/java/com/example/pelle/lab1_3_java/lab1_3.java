package com.example.pelle.lab1_3_java;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.graphics.*;
import java.io.File;

public class lab1_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout mainLayout = new LinearLayout(this);
        LinearLayout horizontalLayout_1 = new LinearLayout(this);
        LinearLayout horizontalLayout_2 = new LinearLayout(this);
        LinearLayout horizontalLayout_3 = new LinearLayout(this);

        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        horizontalLayout_1.setOrientation(LinearLayout.HORIZONTAL);
        horizontalLayout_1.setGravity(Gravity.LEFT);
        horizontalLayout_2.setOrientation(LinearLayout.HORIZONTAL);
        horizontalLayout_2.setGravity(Gravity.LEFT);
        horizontalLayout_3.setOrientation(LinearLayout.HORIZONTAL);
        horizontalLayout_3.setGravity(Gravity.LEFT);

        //first textview
        TextView tv = new TextView(this);
        tv.setText("text");
        mainLayout.addView(tv);
        //first checkboxes
        String[] s = {"a","b","c"};
        for(int i = 0; i < 3; ++i){
            horizontalLayout_1.addView(getCheckbox(s[i]),getWrap());
        }
        mainLayout.addView(horizontalLayout_1);
         //second textview
        tv.setText("text2");
        mainLayout.addView(tv,wrapHeight());
        //second checkboxes
        for(int i = 0; i < 2; ++i){
            horizontalLayout_2.addView(getCheckbox(s[i]),getWrap());
        }
        mainLayout.addView(horizontalLayout_2,getWrap());

        //add image
        String path = "C:/Users/Pelle/Desktop/img.img.jpg";
        ImageView iw = new ImageView(this);

        File imgFile = new File(path);
        if(imgFile.exists())
        {
            Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
            iw.setImageBitmap(myBitmap);
            mainLayout.addView(iw);

        }

        //third checkboxes
        for(int i = 0; i < 2; ++i){
            horizontalLayout_3.addView(getCheckbox(s[i]),getWrap());
        }
        mainLayout.addView(horizontalLayout_3,getWrap());
        //button
        Button bt = new Button(this);
        bt.setGravity(Gravity.CENTER_HORIZONTAL);
        bt.setText("Button");
        mainLayout.addView(bt);

    }

    CheckBox getCheckbox(String s){
        CheckBox cb = new CheckBox(this);
        cb.setText(s);
        return cb;
    }




    LinearLayout.LayoutParams getWrap(){
        LinearLayout.LayoutParams fullWrap = new LinearLayout.LayoutParams
                (
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        return fullWrap;
    }
    LinearLayout.LayoutParams getMatch(){
        LinearLayout.LayoutParams fullMatch = new LinearLayout.LayoutParams
                (
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT
                );
        return fullMatch;
    }
    LinearLayout.LayoutParams wrapHeight(){
        LinearLayout.LayoutParams wrapHeight = new LinearLayout.LayoutParams
                (
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.MATCH_PARENT
                );
        return wrapHeight;
    }
    LinearLayout.LayoutParams wrapwitdh(){
        LinearLayout.LayoutParams wrapwitdh = new LinearLayout.LayoutParams
                (
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        return wrapwitdh;
    }
}
