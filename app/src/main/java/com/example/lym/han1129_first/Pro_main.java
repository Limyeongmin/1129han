package com.example.lym.han1129_first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by LYM on 2016-10-19.
 */
public class Pro_main extends Activity {
    Button makeClass, viewClass;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_main);
        setTitle("메인화면");

        makeClass = (Button)findViewById(R.id.makeClass);
        viewClass = (Button)findViewById(R.id.viewClass);

        //강의 개설 버튼 클릭 시 정의
        makeClass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    Intent i = new Intent(Pro_main.this, Sign.class);
                    startActivity(i);


            }
        });


        //강의 평가 버튼 클릭 시 정의
        viewClass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(Pro_main.this, Sign.class);
                startActivity(i);

            }
        });
    }
}
