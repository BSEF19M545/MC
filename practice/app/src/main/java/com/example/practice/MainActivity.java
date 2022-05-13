package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button inc,dec,res;
    TextView view;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc=findViewById(R.id.btn_inc);
        dec=findViewById(R.id.btn_dec);
        res=findViewById(R.id.btn_rst);
        view=findViewById(R.id.textView);

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                view.setText(Integer.toString(counter));

            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                view.setText(Integer.toString(counter));
            }
        });
    }

    public void reset(View v) {
        counter=0;
        view.setText(Integer.toString(counter));
    }
    private void setTextview(int i)
    {
        view.setText(Integer.toString(i));
    }
}