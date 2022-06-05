package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class customQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_quiz);

        ArrayList<quizClass> quizClassArrayList = new ArrayList<quizClass>();
        //num of questions can be implemented here
        Random r=new Random();
        String[] arr={"a1","a2","b1","b2","c1","c2","d1","d2","e1","e2"};/*,"f1","f2","g1","g2","h1","h2","i1","i2","j1","j2","k1","k2","l1","l2","m1","m2","n1","n2","o1","o2","p1","p2","q1","q2","r1","r2","s1","s2","t1","t2","u1","u2","v1","v2","w1","w2","x1","x2","y1","y2","z1","z2"};*/
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

        quizClassArrayList.add(setValue(name1));
        quizClassArrayList.add(setValue(name2));
        quizClassArrayList.add(setValue(name3));
        quizClassArrayList.add(setValue(name4));
        quizClassArrayList.add(setValue(name5));

        quizAdapter adapter = new quizAdapter(this, quizClassArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);


        Button btn=findViewById(R.id.btn_sub);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RadioGroup[] rg=new RadioGroup[5];
                RadioButton[] rb=new RadioButton[5];
                View [] adapterView=new View[5];
                adapterView[0]=adapter.getView(0,null,null);
                rg[0]=adapterView[0].findViewById(R.id.rg1);

                adapterView[1]=adapter.getView(1,null,null);
                rg[1]=adapterView[1].findViewById(R.id.rg1);

                adapterView[2]=adapter.getView(2,null,null);
                rg[2]=adapterView[2].findViewById(R.id.rg1);

                adapterView[3]=adapter.getView(3,null,null);
                rg[3]=adapterView[3].findViewById(R.id.rg1);

                adapterView[4]=adapter.getView(4,null,null);
                rg[4]=adapterView[4].findViewById(R.id.rg1);
                if(emptyCheck(rg,adapterView)==1) {


                    rb[0] = adapterView[0].findViewById(rg[0].getCheckedRadioButtonId());
                    rb[1] = adapterView[1].findViewById(rg[1].getCheckedRadioButtonId());
                    rb[2] = adapterView[2].findViewById(rg[2].getCheckedRadioButtonId());
                    rb[3] = adapterView[3].findViewById(rg[3].getCheckedRadioButtonId());
                    rb[4] = adapterView[4].findViewById(rg[4].getCheckedRadioButtonId());
                    int marks = 0;

                    for (int i = 0; i < 5; i++) {
                        if (rb[i].getText().toString().charAt(0) == (quizClassArrayList.get(i)).getAns()) {
                            marks += 1;
                        }
                    }


                    Toast.makeText(customQuiz.this, "You obtained " + marks + " marks", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private int emptyCheck(RadioGroup[] rg,View[] adapterView) {
        String output="";
        if(adapterView[0].findViewById(rg[0].getCheckedRadioButtonId()) == null||adapterView[1].findViewById(rg[1].getCheckedRadioButtonId()) == null||adapterView[2].findViewById(rg[2].getCheckedRadioButtonId()) == null||adapterView[3].findViewById(rg[3].getCheckedRadioButtonId()) == null||adapterView[4].findViewById(rg[4].getCheckedRadioButtonId()) == null)
        {
            for(int i=0;i<5;i++) {
                if (adapterView[i].findViewById(rg[i].getCheckedRadioButtonId()) == null) {
                    output += (i+1)+" ";
                }
            }
            Toast.makeText(customQuiz.this, "Please mark question " + output , Toast.LENGTH_SHORT).show();
            return 0;
        }
        return 1;
    }

    private quizClass setValue(String name) {
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

        char[] opt={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char opt1,opt2,opt3;
        //String str="C";
        opt1=Character.toUpperCase(name.charAt(0));
        do {
            opt2=opt[r.nextInt(arr.length)];
        }
        while (opt2==opt1);
        do {
            opt3=opt[r.nextInt(arr.length)];
        }
        while (opt3==opt1||opt3==opt2);

        //random option
        char[] rOpt=new char[3];

            rOpt[rand1-1]=opt1;
            rOpt[rand2-1]=opt2;
            rOpt[rand3-1]=opt3;

        System.out.println(name);
        return (new quizClass(getResources().getIdentifier(name , "drawable", customQuiz.this.getPackageName()), rOpt[0], rOpt[1], rOpt[2],opt1));//(new ArrayList<quizClass>()).add(new quizClass(getResources().getIdentifier(name , "drawable", customQuiz.this.getPackageName()), opt1, opt2, opt3));

    }
}