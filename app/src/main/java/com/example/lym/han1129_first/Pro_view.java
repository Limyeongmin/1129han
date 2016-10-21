package com.example.lym.han1129_first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by LYM on 2016-10-22.
 */
public class Pro_view extends Activity {
    Button gotoMain;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_view);
        setTitle("상세 상의 평가");

        gotoMain = (Button)findViewById(R.id.gotoMain);
        gotoMain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(Pro_view.this, Pro_main.class);
                startActivity(i);
            }
        });
    }
}
