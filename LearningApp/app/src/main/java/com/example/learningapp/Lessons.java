package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class Lessons extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        ArrayList<String> lessons = new ArrayList<String> ();
        ListView listView;

        lessons.add("A");
        lessons.add("B");
        lessons.add("C");
        lessons.add("D");
        lessons.add("E");
        lessons.add("F");
        lessons.add("G");
        lessons.add("H");
        lessons.add("I");
        lessons.add("J");
        lessons.add("K");
        lessons.add("L");
        lessons.add("M");
        lessons.add("N");
        lessons.add("O");
        lessons.add("P");
        lessons.add("Q");
        lessons.add("R");
        lessons.add("S");
        lessons.add("T");
        lessons.add("U");
        lessons.add("V");
        lessons.add("W");
        lessons.add("X");
        lessons.add("Y");
        lessons.add("Z");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lessons);
        listView = findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);



        /*Button btn_A,btn_B,btn_C,btn_D,btn_E,btn_F,btn_G,btn_H,btn_I,btn_J,btn_K,btn_L, btn_M;
        Button btn_N,btn_O,btn_P,btn_Q,btn_R,btn_S,btn_T,btn_U,btn_V,btn_W,btn_X,btn_Y,btn_Z;

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
        btn_M=findViewById(R.id.M);
        btn_N=findViewById(R.id.N);
        btn_O=findViewById(R.id.O);
        btn_P=findViewById(R.id.P);
        btn_Q=findViewById(R.id.Q);
        btn_R=findViewById(R.id.R);
        btn_S=findViewById(R.id.S);
        btn_T=findViewById(R.id.T);
        btn_U=findViewById(R.id.U);
        btn_V=findViewById(R.id.V);
        btn_W=findViewById(R.id.W);
        btn_X=findViewById(R.id.X);
        btn_Y=findViewById(R.id.Y);
        btn_Z=findViewById(R.id.Z);

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
        btn_M.setOnClickListener(this);
        btn_N.setOnClickListener(this);
        btn_O.setOnClickListener(this);
        btn_P.setOnClickListener(this);
        btn_Q.setOnClickListener(this);
        btn_R.setOnClickListener(this);
        btn_S.setOnClickListener(this);
        btn_T.setOnClickListener(this);
        btn_U.setOnClickListener(this);
        btn_V.setOnClickListener(this);
        btn_W.setOnClickListener(this);
        btn_X.setOnClickListener(this);
        btn_Y.setOnClickListener(this);
        btn_Z.setOnClickListener(this);*/
    }

    @Override
    public void onClick(View view) {
        //view.getId();

        /*Intent intent;
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
            case  R.id.M:
                intent=new Intent(Lessons.this,M.class);
                startActivity(intent);
                break;
            case  R.id.N:
                intent=new Intent(Lessons.this,N.class);
                startActivity(intent);
                break;
            case  R.id.O:
                intent=new Intent(Lessons.this,O.class);
                startActivity(intent);
                break;
            case  R.id.P:
                intent=new Intent(Lessons.this,P.class);
                startActivity(intent);
                break;
            case  R.id.Q:
                intent=new Intent(Lessons.this,Q.class);
                startActivity(intent);
                break;
            case  R.id.R:
                intent=new Intent(Lessons.this,R.class);
                startActivity(intent);
                break;
            case  R.id.S:
                intent=new Intent(Lessons.this,S.class);
                startActivity(intent);
                break;
            case  R.id.T:
                intent=new Intent(Lessons.this,T.class);
                startActivity(intent);
                break;
            case  R.id.U:
                intent=new Intent(Lessons.this,U.class);
                startActivity(intent);
                break;
            case  R.id.V:
                intent=new Intent(Lessons.this,V.class);
                startActivity(intent);
                break;
            case  R.id.W:
                intent=new Intent(Lessons.this,W.class);
                startActivity(intent);
                break;
            case  R.id.X:
                intent=new Intent(Lessons.this,X.class);
                startActivity(intent);
                break;
            case  R.id.Y:
                intent=new Intent(Lessons.this,Y.class);
                startActivity(intent);
                break;
            case  R.id.Z:
                intent=new Intent(Lessons.this,Z.class);
                startActivity(intent);
                break;


        }*/
    }
}