package com.example.learningapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class lessonsAdapter extends ArrayAdapter<lessonsClass> {
    public lessonsAdapter(@NonNull Context context, ArrayList<lessonsClass> lessonsArrayList) {
        super(context, 0,lessonsArrayList);
    }
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        lessonsClass lessons = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_lessons_layout, parent, false);

        ImageView iv1 = convertView.findViewById(R.id.cLImageView1);

        iv1.setImageResource(lessons.imgId1);






        return convertView;
    }
}
