package com.example.myweek4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private String ac,pw;
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editTextTextPersonName);
        et2=(EditText)findViewById(R.id.editTextTextPassword);
        bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ac=et1.getText().toString();
                pw=et2.getText().toString();
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("account",ac);
                bundle.putString("password",pw);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}