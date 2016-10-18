package com.example.lym.han1129_first;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by LYM on 2016-10-18.
 */
public class Sign extends Activity {
    Button joinOk, joincancel;
    EditText  stdPassword, stdNumber, stdCode,stdName;
    Spinner stdGrade;
   // private static final String SERVER_ADDERSS="http://"14.63.223.7:22";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign);
        setTitle("회원가입");

       // StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        //StrictMode.setThreadPolicy(policy);

        joinOk = (Button) findViewById(R.id.joinOk);
        joincancel = (Button) findViewById(R.id.joincancel);
        stdName = (EditText) findViewById(R.id.stdName);
        stdPassword = (EditText) findViewById(R.id.stdPassword);
        stdNumber = (EditText) findViewById(R.id.stdNumber);
        stdGrade = (Spinner) findViewById(R.id.stdGrade);
        //스피너 정의
        final String [] grade ={"1","2","3","4"};
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, grade);
        stdGrade.setAdapter(adapter);

        //입력 누락시 토스트메세지
        joinOk.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                if(stdName.getText().toString().equals("") ||
                        stdGrade.getSelectedItem().toString().equals("") ||
                        stdNumber.getText().toString().equals("") ||
                        stdPassword.toString().equals("")){
                    Toast.makeText(Sign.this, "입력오류입니다.",Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });

    }
}
