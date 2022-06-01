package com.example.practice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    CheckBox checkBoxDone, checkBoxPending, checkBoxRead;
    Button simpleButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        checkBoxDone = findViewById(R.id.checkBox);
        checkBoxDone.setOnClickListener(this);

        checkBoxPending = findViewById(R.id.checkBox2);
        checkBoxPending.setOnClickListener(this);

        checkBoxRead = findViewById(R.id.checkBox3);
        checkBoxRead.setOnClickListener(this);

        simpleButton2 = findViewById(R.id.simpleButton2);

        simpleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.checkBox):
                if (checkBoxDone.isChecked())
                    simpleButton2.setBackgroundColor(getResources().getColor(R.color.red));
                break;
            case (R.id.checkBox2):
                if (checkBoxPending.isChecked())
                    simpleButton2.setBackgroundColor(getResources().getColor(R.color.teal_200));
                break;
            case (R.id.checkBox3):
                if (checkBoxRead.isChecked())
                    simpleButton2.setBackgroundColor(getResources().getColor(R.color.purple_200));
                break;
        }
    }

    
}

