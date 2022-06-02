package com.example.customlistview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView listView;

            ArrayList<Student> studentArrayList = new ArrayList<Student>();
            studentArrayList.add(new Student("Ali", "Alpha", "1", R.drawable.a1));
            studentArrayList.add(new Student("Ahmad", "Beta", "2", R.drawable.a2));
            studentArrayList.add(new Student("Mei nahi bataon ga", "Alpha", "5", R.drawable.a5));
            studentArrayList.add(new Student("Kuin bataon", "Beta", "6", R.drawable.a2));
            MyListView adapter = new MyListView(this, studentArrayList);
            ListView listView = findViewById(R.id.listView);
            listView.setAdapter(adapter);
        }
    }