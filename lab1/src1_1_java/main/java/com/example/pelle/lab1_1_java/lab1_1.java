package com.example.pelle.lab1_1_java;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;

public class lab1_1 extends AppCompatActivity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout layout = new LinearLayout(this);

        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);

        Button button = new Button(this);
        button.setText("EN KNAPP");
        layout.addView(button);

        EditText textField = new EditText(this);
        textField.setMaxLines(1);
        layout.addView(textField);

        int nStar = 5;
        RatingBar starRating = new RatingBar(this);
        starRating.setMax(nStar);
        starRating.setNumStars(nStar);
        layout.addView(starRating, getWrap());

        //set match för att fylla ut
        EditText multilineTextField = new EditText(this);
        layout.addView(multilineTextField, getMatch());

        setContentView(layout);
    }
    LinearLayout.LayoutParams getWrap(){
        LinearLayout.LayoutParams wrap = new LinearLayout.LayoutParams
                (
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        return wrap;
    }
    LinearLayout.LayoutParams getMatch(){
        LinearLayout.LayoutParams match = new LinearLayout.LayoutParams
                (
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        return match;
    }

}