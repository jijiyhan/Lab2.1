package com.example.ji.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    Button close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent enterinfo=getIntent();
        if(enterinfo!=null) {
            String loginName = enterinfo.getStringExtra("loginName");
            String loginAge = enterinfo.getStringExtra("loginAge");
            Toast.makeText(getApplicationContext(), "Student info : " + loginName + ", " + loginAge, Toast.LENGTH_LONG).show();
        }

        close = (Button) findViewById(R.id.closeButton);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}