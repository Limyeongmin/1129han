package com.example.lym.han1129_first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by LYM on 2016-10-18.
 */
public class sign_professor extends Activity {
    Button joinOk, joincancel;
    EditText proPassword, proNumber, proCode,proName;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_professor);
        setTitle("교수 회원가입");

        joinOk = (Button) findViewById(R.id.joinOk);
        joincancel = (Button) findViewById(R.id.joincancel);

        proName = (EditText) findViewById(R.id.proName);
        proPassword = (EditText) findViewById(R.id.proPassword);
        proNumber = (EditText) findViewById(R.id.proNumber);
        proCode = (EditText) findViewById(R.id.proCode);

        //입력 하나라도 빠지면 토스트메세지 전달
        joinOk.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                if(proName.getText().toString().length() == 0){
                    Toast.makeText(sign_professor.this, "이름를 입력하세요!", Toast.LENGTH_SHORT).show();
                    proName.requestFocus();
                    return;
                }
                if(proPassword.getText().toString().length() == 0){
                    Toast.makeText(sign_professor.this, "비밀번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                    proPassword.requestFocus();
                    return;
                }

                if(proNumber.getText().toString().length() == 0){
                    Toast.makeText(sign_professor.this, "전화번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                    proNumber.requestFocus();
                    return;
                }

                if(proCode.getText().toString().length() == 0){
                    Toast.makeText(sign_professor.this, "학번을 입력하세요!", Toast.LENGTH_SHORT).show();
                    proCode.requestFocus();
                    return;
                }
                Intent i = new Intent(sign_professor.this, MainActivity.class);
                startActivity(i);


            }
        });
    }
}
