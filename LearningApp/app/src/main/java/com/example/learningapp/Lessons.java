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

        Button btn_A,btn_B,btn_C,btn_D,btn_E,btn_F,btn_G,btn_H,btn_I,btn_J,btn_K,btn_L ;

        btn_A=findViewById(R.id.A);
        btn_B=findViewById(R.id.B);
        btn_C=findViewById(R.id.C);
        btn_D=findViewById(R.id.D);
        btn_E=findViewById(R.id.E);
        btn_F=findViewById(R.id.F);
        btn_G=findViewById(R.id.G);
        btn_H=findViewById(R.id.H);
        btn_I=findViewById(R.id.I);
        btn_J=findViewById(R.id.J);
        btn_K=findViewById(R.id.K);
        btn_L=findViewById(R.id.L);

        btn_A.setOnClickListener(this);
        btn_B.setOnClickListener(this);
        btn_C.setOnClickListener(this);
        btn_D.setOnClickListener(this);
        btn_E.setOnClickListener(this);
        btn_F.setOnClickListener(this);
        btn_G.setOnClickListener(this);
        btn_H.setOnClickListener(this);
        btn_I.setOnClickListener(this);
        btn_J.setOnClickListener(this);
        btn_K.setOnClickListener(this);
        btn_L.setOnClickListener(this);
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
            case  R.id.F:
                intent=new Intent(Lessons.this,F.class);
                startActivity(intent);
                break;
            case  R.id.G:
                intent=new Intent(Lessons.this,G.class);
                startActivity(intent);
                break;
            case  R.id.H:
                intent=new Intent(Lessons.this,H.class);
                startActivity(intent);
                break;
            case  R.id.I:
                intent=new Intent(Lessons.this,I.class);
                startActivity(intent);
                break;
            case  R.id.J:
                intent=new Intent(Lessons.this,J.class);
                startActivity(intent);
                break;
            case  R.id.K:
                intent=new Intent(Lessons.this,K.class);
                startActivity(intent);
                break;
            case  R.id.L:
                intent=new Intent(Lessons.this,L.class);
                startActivity(intent);
                break;


        }
    }
}