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


        Button btn=findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emptyCheck(rgq1,rgq2,rgq3,rgq4,rgq5);
                int marks=ansCheck(rgq1,rgq2,rgq3,rgq4,rgq5,answer);
                Toast.makeText(getApplicationContext(), "You achieved "+ marks+" marks", Toast.LENGTH_LONG).show();

            }
        });
    }

    private void emptyCheck(RadioGroup one,RadioGroup two,RadioGroup three,RadioGroup four,RadioGroup five) {
        String ans="Please select answer of question";
        if(one.getCheckedRadioButtonId()==-1||two.getCheckedRadioButtonId()==-1||three.getCheckedRadioButtonId()==-1||four.getCheckedRadioButtonId()==-1||five.getCheckedRadioButtonId()==-1)
        {
            if(one.getCheckedRadioButtonId()==-1)
            {
                ans=ans+"1";
            }
            if(two.getCheckedRadioButtonId()==-1)
            {
                ans=ans+",2";
            }
            if(three.getCheckedRadioButtonId()==-1)
            {
                ans=ans+",3";
            }
            if(four.getCheckedRadioButtonId()==-1)
            {
                ans=ans+",4";
            }
            if(five.getCheckedRadioButtonId()==-1)
            {
                ans=ans+",5";
            }
            Toast.makeText(getApplicationContext(), ans, Toast.LENGTH_LONG).show();
        }
        else{
            return;
        }
    }

    private int ansCheck(RadioGroup one,RadioGroup two,RadioGroup three,RadioGroup four,RadioGroup five,char[] answer) {

        RadioButton selectedRadioButton1 = findViewById(one.getCheckedRadioButtonId());
       /* RadioButton selectedRadioButton2 = findViewById(two.getCheckedRadioButtonId());
        RadioButton selectedRadioButton3 = findViewById(three.getCheckedRadioButtonId());
        RadioButton selectedRadioButton4 = findViewById(four.getCheckedRadioButtonId());
        RadioButton selectedRadioButton5 = findViewById(five.getCheckedRadioButtonId());*/

        char[] chk1=new char[5];//{((selectedRadioButton1.getText().toString()).charAt(0)),((selectedRadioButton2.getText().toString()).charAt(0)),((selectedRadioButton3.getText().toString()).charAt(0)),((selectedRadioButton4.getText().toString()).charAt(0)),((selectedRadioButton5.getText().toString()).charAt(0))};
        //System.out.println(((((RadioGroup)findViewById(R.id.rg1)).getCheckedRadioButtonId())));

        if(((RadioButton)findViewById(R.id.rb11)).isChecked())
        {
            chk1[0]=(((RadioButton)findViewById(R.id.rb11)).getText()).charAt(0);
        }
        else if(((RadioButton)findViewById(R.id.rb12)).isChecked())
        {
            chk1[0]=(((RadioButton)findViewById(R.id.rb12)).getText()).charAt(0);
        }
        else if(((RadioButton)findViewById(R.id.rb13)).isChecked())
        {
            chk1[0]=(((RadioButton)findViewById(R.id.rb13)).getText()).charAt(0);
        }

        if(((RadioButton)findViewById(R.id.rb21)).isChecked())
        {
            chk1[1]=(((RadioButton)findViewById(R.id.rb21)).getText()).charAt(0);
        }
        else if(((RadioButton)findViewById(R.id.rb22)).isChecked())
        {
            chk1[1]=(((RadioButton)findViewById(R.id.rb22)).getText()).charAt(0);
        }
        else if(((RadioButton)findViewById(R.id.rb23)).isChecked())
        {
            chk1[1]=(((RadioButton)findViewById(R.id.rb23)).getText()).charAt(0);
        }

        if(((RadioButton)findViewById(R.id.rb31)).isChecked())
        {
            chk1[2]=(((RadioButton)findViewById(R.id.rb31)).getText()).charAt(0);
        }
        else if(((RadioButton)findViewById(R.id.rb32)).isChecked())
        {
            chk1[2]=(((RadioButton)findViewById(R.id.rb32)).getText()).charAt(0);
        }
        else if(((RadioButton)findViewById(R.id.rb33)).isChecked())
        {
            chk1[2]=(((RadioButton)findViewById(R.id.rb33)).getText()).charAt(0);
        }

        if(((RadioButton)findViewById(R.id.rb41)).isChecked())
        {
            chk1[3]=(((RadioButton)findViewById(R.id.rb41)).getText()).charAt(0);
        }
        else if(((RadioButton)findViewById(R.id.rb42)).isChecked())
        {
            chk1[3]=(((RadioButton)findViewById(R.id.rb42)).getText()).charAt(0);
        }
        else if(((RadioButton)findViewById(R.id.rb43)).isChecked())
        {
            chk1[3]=(((RadioButton)findViewById(R.id.rb43)).getText()).charAt(0);
        }

        if(((RadioButton)findViewById(R.id.rb41)).isChecked())
        {
            chk1[4]=(((RadioButton)findViewById(R.id.rb41)).getText()).charAt(0);
        }
        else if(((RadioButton)findViewById(R.id.rb42)).isChecked())
        {
            chk1[4]=(((RadioButton)findViewById(R.id.rb42)).getText()).charAt(0);
        }
        else if(((RadioButton)findViewById(R.id.rb43)).isChecked())
        {
            chk1[4]=(((RadioButton)findViewById(R.id.rb43)).getText()).charAt(0);
        }

        int marks=0;
        for(int i=0;i<5;i++)
        {

            if(chk1[i]==answer[i])
            {
                marks++;
            }
        }
        return marks;
    }

    private char setRadioValue(String picName,String question ) {
        Random r=new Random();
        //option nu,ber generator
        String[] arr={"1","2","3"};
        int rand1=Integer.parseInt(arr[r.nextInt(arr.length)]);
        int rand2=1,rand3=1;

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
