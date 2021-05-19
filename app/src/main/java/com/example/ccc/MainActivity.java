package com.example.ccc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox ch1;
    private CheckBox ch2;
    private CheckBox ch3;
    private CheckBox ch4;
    private CheckBox ch5;
    private CheckBox ch6;
    private CheckBox ch7;
    private CheckBox ch8;
    private CheckBox ch9;
    private CheckBox ch10;
    private CheckBox ch11;
    private TextView result;

    private int res = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.submit);
        result = findViewById(R.id.result);
        ch1 = findViewById(R.id.check1);
        ch2 = findViewById(R.id.check2);
        ch3 = findViewById(R.id.check3);
        ch4 = findViewById(R.id.check4);
        ch5 = findViewById(R.id.check5);
        ch6 = findViewById(R.id.check6);
        ch7 = findViewById(R.id.check7);
        ch8 = findViewById(R.id.check8);
        ch9 = findViewById(R.id.check9);
        ch10 = findViewById(R.id.check10);
        ch11 = findViewById(R.id.check11);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch1.isChecked()==true) res+=1;
                if(ch2.isChecked()==true) res+=1;
                if(ch3.isChecked()==true) res+=1;
                if(ch4.isChecked()==true) res+=1;
                if(ch5.isChecked()==true) res+=1;
                if(ch6.isChecked()==true) res+=1;
                if(ch7.isChecked()==true) res+=1;
                if(ch8.isChecked()==true) res+=2;
                if(ch9.isChecked()==true) res+=2;
                if(ch10.isChecked()==true) res+=3;
                if(ch11.isChecked()==true) res+=3;

                result.setText("나의 점수 : " + Integer.toString(res));
            }
        });


    }
}