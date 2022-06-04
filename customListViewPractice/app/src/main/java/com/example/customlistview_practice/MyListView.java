package com.example.customlistview_practice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

    public class MyListView extends ArrayAdapter<Student> {
        int size;
        public MyListView(@NonNull Context context, ArrayList<Student> studentArrayList) {
            super(context, 0, studentArrayList);
             size=studentArrayList.size();
        }
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            Student student = getItem(position);
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.customized_layout, parent, false);
            //TextView textViewName = convertView.findViewById(R.id.textViewName);
            //TextView textViewCampus = convertView.findViewById(R.id.textViewCampus);
            //TextView textViewId = convertView.findViewById(R.id.textViewID);
            RadioButton rb11 = convertView.findViewById(R.id.rb11);
            RadioButton rb12 = convertView.findViewById(R.id.rb12);
            RadioButton rb13 = convertView.findViewById(R.id.rb13);
            ImageView imageView = convertView.findViewById(R.id.imageView);
            //textViewName.setText(student.name);
            //textViewCampus.setText(student.campus);
            //textViewId.setText(student.rollNumber);
            rb11.setText(student.rollNumber);
            rb12.setText(student.rollNumber);
            rb13.setText(student.rollNumber);
            imageView.setImageResource(student.imageID);
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


