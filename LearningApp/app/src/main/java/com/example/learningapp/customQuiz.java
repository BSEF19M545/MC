package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class customQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_quiz);

        ArrayList<quizClass> quizClassArrayList = new ArrayList<quizClass>();
        //num of questions can be implemented here

        quizClassArrayList.add(new quizClass(R.drawable.a1, "A", "B", "C"));



        quizAdapter adapter = new quizAdapter(this, quizClassArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}