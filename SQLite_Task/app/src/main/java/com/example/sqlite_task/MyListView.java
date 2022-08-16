package com.example.sqlite_task;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
        //con=context;
        //size=studentArrayList.size();
    }
   // Context con;
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
//
         b1=convertView.findViewById(R.id.button3);
         b2=convertView.findViewById(R.id.button4);
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
                //Toast.makeText(getContext(), student.getName(), Toast.LENGTH_SHORT).show();
                //System.out.println("123123132abc");
                DBHelper dbHelper = new DBHelper(getContext());
                dbHelper.updateRecord(123,"cba",true);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper = new DBHelper(getContext());
//                new MainActivity().context.performClick();

//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.getC);
//                builder.setCancelable(true);
//                builder.setTitle("Confirmation");
//                builder.setMessage("Do you want to delete this record");
//                builder.setPositiveButton("Confirm",
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
////                MainActivity main=new MainActivity();
//                if(new MainActivity().rtn) {
//                    dbHelper.deleteRecord(student.getRollNumber());
//                    Toast.makeText(getContext(), "Record Deleted Successfully", Toast.LENGTH_SHORT).show();
//                    new MainActivity().viewRecordButton.performClick();
//
//                }
//                else
//                {
//                    Toast.makeText(getContext(), "Record Not Deleted", Toast.LENGTH_SHORT).show();
//
//                }
//                            }
//                        });
//                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        //Toast.makeText(getContext(), "Record Not Deleted", Toast.LENGTH_SHORT).show();
//
//                    }
//                });

//                AlertDialog dialog = builder.create();
//                dialog.show();

            }
        });
        return convertView;
    }

}
