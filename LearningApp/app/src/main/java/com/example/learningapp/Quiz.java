package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import java.util.Random;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Random r=new Random();
        String[] arr={"a1", "a2","b1","b2","c1","c2","d1","d2","e1","e2","f1","f2","g1","g2","h1","h2","i1","i2","j1","j2","k1","k2","l1","l2","m1","m2","n1","n2","o1","o2","p1","p2","q1","q2","r1","r2","s1","s2","t1","t2","u1","u2","v1","v2","w1","w2","x1","x2","y1","y2","z1","z2"};
        String name1=arr[r.nextInt(arr.length)];
        String name2=arr[r.nextInt(arr.length)];
        String name3=arr[r.nextInt(arr.length)];
        String name4=arr[r.nextInt(arr.length)];
        String name5=arr[r.nextInt(arr.length)];

        View v = findViewById(R.id.view1);
        int resId = getResources().getIdentifier(name1+"_foreground", "mipmap", Quiz.this.getPackageName());
        v.setBackgroundResource(resId);
        (findViewById(R.id.view2)).setBackgroundResource(resId);
        (findViewById(R.id.view2)).setBackgroundResource(resId);
        (findViewById(R.id.view2)).setBackgroundResource(resId);
        (findViewById(R.id.view2)).setBackgroundResource(resId);
        (findViewById(R.id.view2)).setBackgroundResource(resId);
    }
}