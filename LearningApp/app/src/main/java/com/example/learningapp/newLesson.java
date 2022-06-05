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


public class newLesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_lesson);
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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i) {
                    case 0:
                        //intent=new Intent(Lessons.this,A.class);
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","A");
                        startActivity(intent);
                        break;
                    case  1:
                        //intent=new Intent(newLesson.this,B.class);
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","B");
                        startActivity(intent);
                        break;
                    case  2:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","C");
                        startActivity(intent);
                        break;
                    case  3:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","D");
                        startActivity(intent);
                        break;
                    case  4:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","E");
                        startActivity(intent);
                        break;
                    case  5:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","F");
                        startActivity(intent);
                        break;
                    case  6:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","G");
                        startActivity(intent);
                        break;
                    case  7:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","H");
                        startActivity(intent);
                        break;
                    case  8:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","I");
                        startActivity(intent);
                        break;
                    case  9:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","J");
                        startActivity(intent);
                        break;
                    case  10:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","K");
                        startActivity(intent);
                        break;
                    case  11:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","L");
                        startActivity(intent);
                        break;
                    case  12:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","M");
                        startActivity(intent);
                        break;
                    case  13:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","N");
                        startActivity(intent);
                        break;
                    case  14:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","O");
                        startActivity(intent);
                        break;
                    case  15:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","P");
                        startActivity(intent);
                        break;
                    case  16:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","Q");
                        startActivity(intent);
                        break;
                    case  17:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","R");
                        startActivity(intent);
                        break;
                    case  18:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","S");
                        startActivity(intent);
                        break;
                    case  19:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","T");
                        startActivity(intent);
                        break;
                    case  20:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","U");
                        startActivity(intent);
                        break;
                    case  21:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","V");
                        startActivity(intent);
                        break;
                    case  22:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","W");
                        startActivity(intent);
                        break;
                    case  23:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","X");
                        startActivity(intent);
                        break;
                    case  24:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","Y");
                        startActivity(intent);
                        break;
                    case  25:
                        intent=new Intent(newLesson.this,customLessons.class);
                        intent.putExtra("name","Z");
                        startActivity(intent);
                        break;


                }
            }
        });


    }
}
