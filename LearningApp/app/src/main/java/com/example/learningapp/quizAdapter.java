package com.example.learningapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class quizAdapter extends ArrayAdapter<quizClass>{
    boolean[] q1=new boolean[3];
    boolean[] q2=new boolean[3];
    boolean[] q3=new boolean[3];
    boolean[] q4=new boolean[3];
    boolean[] q5=new boolean[3];
    char[] ans=new char[5];


    int size;
    public quizAdapter(@NonNull Context context, ArrayList<quizClass> studentArrayList) {
        super(context, 0, studentArrayList);
        size=studentArrayList.size();
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        quizClass quiz = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_quiz_layout, parent, false);

        RadioButton rb11 = convertView.findViewById(R.id.rb11);
        RadioButton rb12 = convertView.findViewById(R.id.rb12);
        RadioButton rb13 = convertView.findViewById(R.id.rb13);
        ImageView imageView = convertView.findViewById(R.id.imageView7);

        rb11.setText(Character.toString(quiz.op1));
        rb12.setText(Character.toString(quiz.op2));
        rb13.setText(Character.toString(quiz.op3));
        switch (position){
            case 0:
                rb11.setChecked(q1[0]);
                rb12.setChecked(q1[1]);
                rb13.setChecked(q1[2]);
                break;
            case 1:
                rb11.setChecked(q2[0]);
                rb12.setChecked(q2[1]);
                rb13.setChecked(q2[2]);
                break;
            case 2:
                rb11.setChecked(q3[0]);
                rb12.setChecked(q3[1]);
                rb13.setChecked(q3[2]);
                break;
            case 3:
                rb11.setChecked(q4[0]);
                rb12.setChecked(q4[1]);
                rb13.setChecked(q4[2]);
                break;
            case 4:
            rb11.setChecked(q5[0]);
            rb12.setChecked(q5[1]);
            rb13.setChecked(q5[2]);
            break;



        }



        imageView.setImageResource(quiz.image);
        Button button=convertView.findViewById(R.id.submit1);
        button.setVisibility(View.GONE);

        rb11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switch (position) {
                    case 0:
                        q1[0] = b;
                        break;
                    case 1:
                        q2[0]=b;
                        break;
                    case 2:
                        q3[0] = b;
                        break;
                    case 3:
                        q4[0]=b;
                        break;
                    case 4:
                        q5[0] = b;
                        break;

                }
            }
        });
        rb12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switch (position) {
                    case 0:
                        q1[1] = b;
                        break;
                    case 1:
                        q2[1]=b;
                        break;
                    case 2:
                        q3[1] = b;
                        break;
                    case 3:
                        q4[1]=b;
                        break;
                    case 4:
                        q5[1] = b;
                        break;

                }
            }
        });
        rb13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                switch (position) {
                    case 0:
                        q1[2] = b;
                        break;
                    case 1:
                        q2[2]=b;
                        break;
                    case 2:
                        q3[2] = b;
                        break;
                    case 3:
                        q4[2]=b;
                        break;
                    case 4:
                        q5[2] = b;
                        break;

                }
            }
        });



        System.out.println("Position "+position+" and SIze "+size);
        if(position==size-1)
        {
            //button.setVisibility(View.VISIBLE);
        }

        return convertView;
    };
}
