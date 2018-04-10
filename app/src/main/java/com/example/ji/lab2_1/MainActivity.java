package com.example.ji.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText age;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.nameLine);
        age = (EditText) findViewById(R.id.ageLine);
        add = (Button) findViewById(R.id.addButton);

        add.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View view) {
        String UserName = name.getText().toString();
        String UserAge = age.getText().toString();
        Intent intent = new Intent (getApplicationContext(), NewActivity.class);
        intent.putExtra("loginName", UserName);
        intent.putExtra("loginAge", UserAge); startActivity(intent);
        }
    });

 }


}
