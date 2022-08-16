package com.example.sqlite_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

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
    }
}