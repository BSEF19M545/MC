package com.example.sqlite_task;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
    Button addRecordButton, viewRecordButton,context;
    EditText editTextName, editTextRollNumber;
    Switch switchIsActive;
    ListView customListView;
    public Context con=MainActivity.this;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addRecordButton=findViewById(R.id.addRecordButton);
        viewRecordButton=findViewById(R.id.viewRecordButton);
        context=findViewById(R.id.context);
        editTextName=findViewById(R.id.editTextName);
        editTextRollNumber=findViewById(R.id.editTextRollNumber);
        customListView=findViewById(R.id.customListView);
        switchIsActive=findViewById(R.id.switchStudent);
        viewRecordButton.performClick();

        addRecordButton.setOnClickListener(new View.OnClickListener() {
            Student student;

            @Override
            public void onClick(View v) {

                try {
                    student = new Student(editTextName.getText().toString(), Integer.parseInt(editTextRollNumber.getText().toString()), switchIsActive.isChecked());
                    //Toast.makeText(MainActivity.this, Student.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                    return;
                }
                DBHelper dbHelper  = new DBHelper(MainActivity.this);
                if(!dbHelper.addStudent(student))
                {
                    Toast.makeText(MainActivity.this, "Record Already Exists", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Record Added Successfully", Toast.LENGTH_SHORT).show();
                    viewRecordButton.performClick();

                }
            }
        });
        viewRecordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(MainActivity.this);
                ArrayList<Student> list = dbHelper.getAllStudents();
                if(list.size()==0) {
                    Toast.makeText(MainActivity.this, "No Data Available", Toast.LENGTH_SHORT).show();
                }
                    MyListView adapter = new MyListView(getApplicationContext(), list);
                    customListView.setAdapter(adapter);
            }
        });

    }


}