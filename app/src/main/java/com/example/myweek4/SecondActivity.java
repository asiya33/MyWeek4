package com.example.myweek4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private String ac,pw;
    private TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        ac=bundle.getString("account");
        pw=bundle.getString("password");
        tv1=(TextView)findViewById(R.id.tvname);
        tv2=(TextView)findViewById(R.id.tvpw);
        tv1.setText(ac);
        tv2.setText(pw);
        Toast.makeText(SecondActivity.this,ac+"  "+pw,Toast.LENGTH_SHORT);

    }
}