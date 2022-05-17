package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
//import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button inc,dec,res,btn;
    TextView view;
    int counter=0;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc=findViewById(R.id.btn_inc);
        dec=findViewById(R.id.btn_dec);
        res=findViewById(R.id.btn_rst);
        view=findViewById(R.id.textView);
        btn=findViewById(R.id.button);
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                view.setText(Integer.toString(counter));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });
        dec.setOnClickListener(v -> {

                    counter--;
                    view.setText(Integer.toString(counter));

                });
        res.setOnClickListener(v-> {
                counter=0;
                view.setText(Integer.toString(counter));

        });
    }

}