package com.example.sqlite_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Update extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
    Button b=findViewById(R.id.upbutton);
    b.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int a=Integer.valueOf( getIntent().getStringExtra("roll"));
            DBHelper dbHelper=new DBHelper(getApplicationContext());
            EditText et1=findViewById(R.id.et1);
            Switch sw=findViewById(R.id.switch1);
            if(dbHelper.updateRecord(a,et1.getText().toString(),sw.isChecked())){
                Toast.makeText(Update.this, "Record Updated Successfully", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(view.getContext(),MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                view.getContext().startActivity(intent);
            }
            else{
                Toast.makeText(Update.this, "Record Not Updated ", Toast.LENGTH_SHORT).show();

            }


        }
    });
    }
}