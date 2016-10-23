package com.example.lym.han1129_first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by LYM on 2016-10-23.
 */
public class Std_Surbey extends Activity {
    Button input_finish;
    RadioButton a,b,c,d,e;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.std_surbey);
        input_finish = (Button)findViewById(R.id.input_finish);
        a = (RadioButton)findViewById(R.id.a);
        b = (RadioButton)findViewById(R.id.b);
        c = (RadioButton)findViewById(R.id.c);
        d = (RadioButton)findViewById(R.id.d);
        e = (RadioButton)findViewById(R.id.e);
        input_finish.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(Std_Surbey.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
