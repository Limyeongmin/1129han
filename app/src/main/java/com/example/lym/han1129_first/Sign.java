package com.example.lym.han1129_first;

import android.app.Activity;
import android.content.Intent;
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
    EditText  stdPassword, stdNumber, stdCode,stdName,stdNum;
    Spinner stdGrade;
   // private static final String SERVER_ADDERSS="http://"14.63.223.7:22";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign);
        setTitle("회원가입");


        joinOk = (Button) findViewById(R.id.joinOk);
        joincancel = (Button) findViewById(R.id.joincancel);
        stdName = (EditText) findViewById(R.id.stdName);
        stdPassword = (EditText) findViewById(R.id.stdPassword);
        stdNumber = (EditText) findViewById(R.id.stdNumber);
        stdGrade = (Spinner) findViewById(R.id.stdGrade);
        stdNum = (EditText) findViewById(R.id.stdNum);
        //스피너 정의
        final String [] grade ={"1","2","3","4"};
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, grade);
        stdGrade.setAdapter(adapter);

        //입력 누락시 토스트메세지

        joinOk.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                if(stdName.getText().toString().length() == 0){
                    Toast.makeText(Sign.this, "이름을 입력하세요!", Toast.LENGTH_SHORT).show();
                    stdName.requestFocus();
                    return;
                }
                if(stdPassword.getText().toString().length() == 0){
                    Toast.makeText(Sign.this, "비밀번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                    stdPassword.requestFocus();
                    return;
                }
                if(stdNum.getText().toString().length() == 0){
                    Toast.makeText(Sign.this, "학번을 입력하세요!", Toast.LENGTH_SHORT).show();
                    stdNum.requestFocus();
                    return;
                }
                if(stdNumber.getText().toString().length() == 0){
                    Toast.makeText(Sign.this, "전화번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                    stdNumber.requestFocus();
                    return;
                }
                if(stdGrade.getSelectedItem().toString().length() == 0){
                    Toast.makeText(Sign.this, "학년을 입력하세요!", Toast.LENGTH_SHORT).show();
                    stdGrade.requestFocus();
                    return;
                }
                Intent i = new Intent(Sign.this, MainActivity.class);
                startActivity(i);

            }
        });

        joincancel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
    }
}
