package com.example.sqlite_task;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Confirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle("Confirmation");
        builder.setMessage("Do you want to delete this record");
        builder.setPositiveButton("Confirm",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //rtn =true;
                        int a=Integer.valueOf( getIntent().getStringExtra("roll"));
                        new DBHelper(getApplicationContext()).deleteRecord(a);
                        Toast.makeText(getApplicationContext(), "Record Deleted Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                        startActivity(intent);

                    }
                });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Record Not Deleted ", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);

            }
        });
        AlertDialog dialog = builder.create();

        dialog.show();
    }
}