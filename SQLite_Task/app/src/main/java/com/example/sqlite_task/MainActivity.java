package com.example.sqlite_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button addRecordButton, viewRecordButton;
    EditText editTextName, editTextRollNumber;
    Switch switchIsActive;
    ListView customListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addRecordButton=findViewById(R.id.addRecordButton);
        viewRecordButton=findViewById(R.id.viewRecordButton);
        editTextName=findViewById(R.id.editTextName);
        editTextRollNumber=findViewById(R.id.editTextRollNumber);
        customListView=findViewById(R.id.customListView);

        addRecordButton.setOnClickListener(new View.OnClickListener() {
            Student student;

            @Override
            public void onClick(View v) {
                try {
                    student = new Student(editTextName.getText().toString(), Integer.parseInt(editTextRollNumber.getText().toString()),false/*, switchIsActive.isChecked()*/);
                    //Toast.makeText(MainActivity.this, Student.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper  = new DBHelper(MainActivity.this);
                dbHelper.addStudent(student);
            }
        });
        viewRecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(MainActivity.this);
                ArrayList<Student> list = dbHelper.getAllStudents();
                /*ArrayAdapter arrayAdapter = new ArrayAdapter<Student>
                        (MainActivity.this, android.R.layout.simple_list_item_1,list);
                customListView.setAdapter(arrayAdapter);*/
//                MyListView adapter = new MyListView(this, list);
                MyListView adapter=new MyListView(getApplicationContext(),list);
                customListView.setAdapter(adapter);


            }
        });
//        customListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
////                Intent intent;
////                adapterView.getItemAtPosition(0);
//                System.out.println("adapterView.getItemAtPosition(i)");
//                switch (i) {
//                    case 0:
//                        //intent=new Intent(Lessons.this,A.class);
//                        Toast.makeText(MainActivity.this, "list.get(i).toString()", Toast.LENGTH_SHORT).show();
//                        break;
//                    case  1:
//                        Toast.makeText(MainActivity.this, "list.get(i).toString()", Toast.LENGTH_SHORT).show();
//
//                        break;
//                    case  2:
//                        Toast.makeText(MainActivity.this, "list.get(i).toString()", Toast.LENGTH_SHORT).show();
//
//                        break;
//                    case  3:
//                        Toast.makeText(MainActivity.this, "list.get(i).toString()", Toast.LENGTH_SHORT).show();
//
//                        break;
//
//
//
//                }
//            }
//        });
//        customListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//            }
//        });

    }
}