package com.example.lym.han1129_first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by LYM on 2016-10-22.
 */
public class Pro_evaluation extends Activity {
    Button check;
    ListView listView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_evaluation);
        setTitle("교수 평가");

        check = (Button)findViewById(R.id.check);
        listView = (ListView)findViewById(R.id.listView);

        check.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(Pro_evaluation.this, Pro_evaluation2.class);
                startActivity(i);

            }
        });
    }
}
