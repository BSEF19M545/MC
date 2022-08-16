package com.example.sqlite_task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyListView extends ArrayAdapter<Student> {
    Button b1,b2;
    public MyListView(@NonNull Context context, ArrayList<Student> student) {
        super(context, 0, student);
        //size=studentArrayList.size();
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Student student = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.customized_layout, parent, false);

        TextView tv1= convertView.findViewById(R.id.textView13);
        TextView tv2= convertView.findViewById(R.id.textView14);
        TextView tv3= convertView.findViewById(R.id.textView15);
//
         b1=convertView.findViewById(R.id.button);
         b2=convertView.findViewById(R.id.button2);
//
        //b1.setText(student.getName());
//        tv1.setText("123");
        tv1.setText(student.getName());
        tv2.setText(String.valueOf(student.getRollNumber()));
        tv3.setText(student.isEnroll()==true?"true":"False");
        String str=student.getName();
        //button  ka kya krna hai pta nahi

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(this, student.toString(), Toast.LENGTH_SHORT).show();
                System.out.printf(student.toString());
            }
        });
        return convertView;
    }

}
