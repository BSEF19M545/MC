package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

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
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.checkBox):
                if (checkBoxDone.isChecked())
                    simpleButton2.setText("Check Box Done");
                break;
            case (R.id.checkBox2):
                if (checkBoxPending.isChecked())
                    simpleButton2.setText("Check Box Pending");
                break;
            case (R.id.checkBox3):
                if (checkBoxRead.isChecked())
                    simpleButton2.setText("Check Box Read");
                break;
        }
    }
}

