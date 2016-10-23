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
                if (student.isChecked()){
                    Intent i = new Intent(MainActivity.this, Std_Join.class);
                    startActivity(i);
                }else if(professor.isChecked()){
                    Intent i = new Intent(MainActivity.this, Pro_main.class);
                    startActivity(i);
                }
            }
            /*  에러뜨네 ㅅㅂ
            public void onClick(View v) {
                if (student.isChecked()) {
                    if (stdNum.getText().toString().length() == 0) {
                        Toast.makeText(MainActivity.this, "전화번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                        stdNum.requestFocus();
                        return;
                    } else if (pw.getText().toString().length() == 0) {
                        Toast.makeText(MainActivity.this, "비밀번호를 입력해주세요!", Toast.LENGTH_SHORT).show();
                        pw.requestFocus();
                        return;
                    } else {
                        Toast.makeText(MainActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, Pro_main.class);
                        startActivity(i);
                    }
                }
            }*/
        });
    }
}