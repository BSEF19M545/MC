package com.example.sqlite_task;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
    Context con;

    public MyListView(@NonNull Context context, ArrayList<Student> student) {
        super(context, 0, student);

    }
    public void save(Context conn)
    {
        con=conn;
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Student student = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.customized_layout, parent, false);

        TextView tv1= convertView.findViewById(R.id.textView13);
        TextView tv2= convertView.findViewById(R.id.textView14);
        TextView tv3= convertView.findViewById(R.id.textView15);
         b1=convertView.findViewById(R.id.button3);
         b2=convertView.findViewById(R.id.button4);
        tv1.setText(student.getName());
        tv2.setText(String.valueOf(student.getRollNumber()));
        tv3.setText(student.isEnroll()==true?"true":"False");
        String str=student.getName();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(view.getContext(),Update.class);
                intent.putExtra("roll",String.valueOf(student.getRollNumber()));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getContext().startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //DBHelper dbHelper = new DBHelper(getContext());
                Intent intent=new Intent(view.getContext(),Confirmation.class);
                intent.putExtra("roll",String.valueOf(student.getRollNumber()));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                view.getContext().startActivity(intent);
            }
        });
        return convertView;
    }

}
