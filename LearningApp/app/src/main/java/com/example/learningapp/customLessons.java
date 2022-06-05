package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class customLessons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_lessons);

        ArrayList<lessonsClass> lessonsArrayList = new ArrayList<lessonsClass>();

        TextView tv=findViewById(R.id.textViewAlpha);
        Intent intent=getIntent();

        tv.setText(intent.getStringExtra("name"));


        String[] pics={"a1","a2","b1","b2","c1","c2","d1","d2","e1","e2","f1","f2","g1","g2","h1","h2","i1","i2","j1","j2","k1","k2","l1","l2","m1","m2","n1","n2","o1","o2","p1","p2","q1","q2","r1","r2","s1","s2","t1","t2","u1","u2","v1","v2","w1","w2","x1","x2","y1","y2","z1","z2"};
        for(int i=0;i<pics.length;i++)
        {
            if(Character.toUpperCase(pics[i].charAt(0))==intent.getStringExtra("name").charAt(0))
            {
                lessonsArrayList.add(new lessonsClass(getResources().getIdentifier("@drawable/"+pics[i], null, getPackageName())));
               // getResources().getDrawable(getResources().getIdentifier("@drawable/"+pics[i], null, getPackageName()));
            }
        }


        lessonsAdapter adapter = new lessonsAdapter(this, lessonsArrayList);
        ListView listView = findViewById(R.id.customListViewAlpha);
        listView.setAdapter(adapter);
    }
}