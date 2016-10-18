package com.example.lym.han1129_first;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btnLogin, btnSign;
    EditText stdNum,pw;
    SharedPreferences pref;
    CheckBox autoLogin;
    RadioButton professor, student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stdNum = (EditText) findViewById(R.id.emailInput);
        pw = (EditText) findViewById(R.id.pw);
        autoLogin = (CheckBox) findViewById(R.id.checkBox);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        professor = (RadioButton) findViewById(R.id.professor);
        student = (RadioButton) findViewById(R.id.student);
        btnSign = (Button) findViewById(R.id.btnSign);





        //회원가입 버튼 정의
        btnSign.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (student.isChecked()){
                    Intent i = new Intent(MainActivity.this, Sign.class);
                    startActivity(i);
                 }else if(professor.isChecked()){
                    Intent i = new Intent(MainActivity.this, sign_professor.class);
                    startActivity(i);
                }
            }
        });

        //로그인 버튼 정의
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(stdNum.getText().toString().equals("") ||
                        pw.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "입력오류입니다.",Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    //2016-10-18
                    //로그인 넘어가는 화면 작성
                }
            }
        });

    }
}