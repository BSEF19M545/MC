package com.example.learningapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class quizAdapter extends ArrayAdapter<quizClass>{

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

        rb11.setText(quiz.op1);
        rb12.setText(quiz.op2);
        rb13.setText(quiz.op3);
        imageView.setImageResource(quiz.image);
        Button button=convertView.findViewById(R.id.button);
        button.setVisibility(View.GONE);
        System.out.println("Position"+position+" and SIze"+size);
        if(position==size-1)
        {
            button.setVisibility(View.VISIBLE);
        }

        return convertView;
    };
}
