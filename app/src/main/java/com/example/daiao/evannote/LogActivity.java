package com.example.daiao.evannote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogActivity extends AppCompatActivity {
    private EditText mAccount;
    private EditText mPassword;
    private Button mlogbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        iView();
        iEvent();
    }
    //chushihua
    private void iView(){
        mAccount=(EditText)findViewById(R.id.id_account);
        mPassword=(EditText)findViewById(R.id.id_password);
        mlogbutton=(Button)findViewById(R.id.log_button);
    }
    private void iEvent(){
        mlogbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                judgeLogin();
            }
        });
    }
    private void judgeLogin(){
        Intent intent = new Intent(LogActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
