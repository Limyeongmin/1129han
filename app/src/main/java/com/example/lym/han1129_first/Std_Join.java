package com.example.lym.han1129_first;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

/**
 * Created by LYM on 2016-10-23.
 */
public class Std_Join extends Activity
        implements TextWatcher {
    Button first_1, second;
    private AutoCompleteTextView autoComplete;
    private String item[] = {"궁상환","강경우","강윤희","유진호","정삼진",
            "윤택현","한정수","이근호"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.std_join);
        first_1 = (Button)findViewById(R.id.first_1);
        second = (Button)findViewById(R.id.second);

        first_1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(Std_Join.this, Std_Surbey.class);
                startActivity(i);
            }
        });

        second.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(Std_Join.this, Std_Surbey.class);
                startActivity(i);
            }
        });


        autoComplete = (AutoCompleteTextView) findViewById(R.id.myautocomplete);
        autoComplete.addTextChangedListener(this);
        autoComplete.setAdapter(new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                item));
        autoComplete.setTextColor(Color.RED);
    }

    public void afterTextChanged(Editable arg0) {
        // TODO Auto-generated method stub

    }

    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        // TODO Auto-generated method stub

    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        // TODO Auto-generated method stub

    }
}