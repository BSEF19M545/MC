package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lessons extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        Button btn_A,btn_B,btn_C,btn_D,btn_E ;

        btn_A=findViewById(R.id.A);
        btn_B=findViewById(R.id.B);
        btn_C=findViewById(R.id.C);
        btn_D=findViewById(R.id.D);
        btn_E=findViewById(R.id.E);

        btn_A.setOnClickListener(this);
        btn_B.setOnClickListener(this);
        btn_C.setOnClickListener(this);
        btn_D.setOnClickListener(this);
        btn_E.setOnClickListener(this);
        Intent intent;
    }

    @Override
    public void onClick(View view) {
        //view.getId();

        Intent intent;
        switch (view.getId()) {
            case R.id.A:

                intent=new Intent(Lessons.this,A.class);
                startActivity(intent);
                break;
            case  R.id.B:
                intent=new Intent(Lessons.this,B.class);
                startActivity(intent);
                break;
            case  R.id.C:
                intent=new Intent(Lessons.this,C.class);
                startActivity(intent);
                break;
            case  R.id.D:
                intent=new Intent(Lessons.this,D.class);
                startActivity(intent);
                break;
            case  R.id.E:
                intent=new Intent(Lessons.this,E.class);
                startActivity(intent);
                break;

        }
    }
}