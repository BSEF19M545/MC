package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import java.util.Random;

import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Random r=new Random();
        String[] arr={"a1", "a2","b1","b2","c1","c2","d1","d2","e1","e2","f1","f2","g1","g2","h1","h2","i1","i2","j1","j2","k1","k2","l1","l2","m1","m2","n1","n2","o1","o2","p1","p2","q1","q2","r1","r2","s1","s2","t1","t2","u1","u2","v1","v2","w1","w2","x1","x2","y1","y2","z1","z2"};
        String name1=arr[r.nextInt(arr.length)];
        String name2,name3,name4,name5;
        do {
            name2 = arr[r.nextInt(arr.length)];
        }
        while (name1.equals(name2));
        do {
            name3=arr[r.nextInt(arr.length)];
        }
        while (name3.equals(name1)||name3.equals(name2));
        do {
            name4=arr[r.nextInt(arr.length)];
        }
        while (name4.equals(name2)||name4.equals(name1)||name4.equals(name3));
        do {
            name5=arr[r.nextInt(arr.length)];
        }
        while (name5.equals(name1)||name5.equals(name2)||name5.equals(name3)||name5.equals(name4));

        char opt1=setRadioValue(name1,"rb1");
        char opt2=setRadioValue(name2,"rb2");
        char opt3=setRadioValue(name3,"rb3");
        char opt4=setRadioValue(name4,"rb4");
        char opt5=setRadioValue(name5,"rb5");
        //System.out.println(opt5);
        char[] answer={opt1,opt2,opt3,opt4,opt5};

        View v = findViewById(R.id.view1);
        int resId1;
        resId1=getResources().getIdentifier(name1 + "_foreground", "mipmap", Quiz.this.getPackageName());
        v.setBackgroundResource(resId1);
        (findViewById(R.id.view2)).setBackgroundResource(getResources().getIdentifier(name2 + "_foreground", "mipmap", Quiz.this.getPackageName()));
        (findViewById(R.id.view5)).setBackgroundResource(getResources().getIdentifier(name3 + "_foreground", "mipmap", Quiz.this.getPackageName()));
        (findViewById(R.id.view6)).setBackgroundResource(getResources().getIdentifier(name4 + "_foreground", "mipmap", Quiz.this.getPackageName()));
        (findViewById(R.id.view7)).setBackgroundResource(getResources().getIdentifier(name5 + "_foreground", "mipmap", Quiz.this.getPackageName()));


        RadioGroup rgq1=findViewById(R.id.rg1);
        RadioGroup rgq2=findViewById(R.id.rg2);
        RadioGroup rgq3=findViewById(R.id.rg3);
        RadioGroup rgq4=findViewById(R.id.rg4);
        RadioGroup rgq5=findViewById(R.id.rg5);

        RadioGroup[] out={rgq1,rgq2,rgq3,rgq4,rgq5};

        Button btn=findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(emptyCheck(out)==1)
                {
                    int marks=ansCheck(out,answer);
                    Toast.makeText(getApplicationContext(), "You achieved "+ marks+" marks", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    private int emptyCheck(RadioGroup[] out) {
        String ans="Please select answer of question";
        if(out[0].getCheckedRadioButtonId()==-1||out[1].getCheckedRadioButtonId()==-1||out[2].getCheckedRadioButtonId()==-1||out[3].getCheckedRadioButtonId()==-1||out[4].getCheckedRadioButtonId()==-1)
        {
            if(out[0].getCheckedRadioButtonId()==-1)
            {
                ans=ans+"1";
            }
            if(out[1].getCheckedRadioButtonId()==-1)
            {
                ans=ans+",2";
            }
            if(out[2].getCheckedRadioButtonId()==-1)
            {
                ans=ans+",3";
            }
            if(out[3].getCheckedRadioButtonId()==-1)
            {
                ans=ans+",4";
            }
            if(out[4].getCheckedRadioButtonId()==-1)
            {
                ans=ans+",5";
            }
            Toast.makeText(getApplicationContext(), ans, Toast.LENGTH_LONG).show();
            return 0;
        }
        else{
            return 1;
        }
    }

    private int ansCheck(RadioGroup[] out,char[] answer) {

        RadioButton[] rBtn=new RadioButton[5];
        rBtn[0]=(RadioButton) findViewById(out[0].getCheckedRadioButtonId());
        //System.out.println(selectedRadioButton1.getText().toString());
        rBtn[1] = (RadioButton)findViewById(out[1].getCheckedRadioButtonId());
        rBtn[2] = (RadioButton) findViewById(out[2].getCheckedRadioButtonId());
        rBtn[3] = (RadioButton)findViewById(out[3].getCheckedRadioButtonId());
        rBtn[4] = (RadioButton)findViewById(out[4].getCheckedRadioButtonId());


        char[] chk1=new char[5];
        for(int i=0;i<5;i++)
        {
            chk1[i]=rBtn[i].getText().toString().charAt(0);
        }


        int marks=0;
        for(int i=0;i<5;i++)
        {
            if(chk1[i]==answer[i])
            {
                marks++;
                rBtn[i].setBackgroundColor(getResources().getColor(R.color.green));
            }
            else
            {
                rBtn[i].setBackgroundColor(getResources().getColor(R.color.red));
            }
        }
        return marks;
    }

    private char setRadioValue(String picName,String question ) {
        Random r=new Random();
        //option nu,ber generator
        String[] arr={"1","2","3"};
        int rand1=Integer.parseInt(arr[r.nextInt(arr.length)]);
        int rand2,rand3;

        do {
            rand2=Integer.parseInt(arr[r.nextInt(arr.length)]);
        }
        while (rand2==rand1);
        do {
            rand3=Integer.parseInt(arr[r.nextInt(arr.length)]);
        }
        while (rand3==rand1||rand3==rand2);
        //option generator
        char[] opt={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char opt1,opt2,opt3;
        //String str="C";
        opt1=Character.toUpperCase(picName.charAt(0));
        do {
            opt2=opt[r.nextInt(arr.length)];
        }
        while (opt2==opt1);
        do {
            opt3=opt[r.nextInt(arr.length)];
        }
        while (opt3==opt1||opt3==opt2);
        String rb=question+rand1;
        ((RadioButton)findViewById(getResources().getIdentifier(rb, "id", Quiz.this.getPackageName()))).setText(Character.toString(opt1));
        String rb1=question+rand2;
        ((RadioButton)findViewById(getResources().getIdentifier(rb1, "id", Quiz.this.getPackageName()))).setText(Character.toString(opt2));
        String rb3=question+rand3;
        ((RadioButton)findViewById(getResources().getIdentifier(rb3, "id", Quiz.this.getPackageName()))).setText(Character.toString(opt3));
        return opt1;
    }
}
