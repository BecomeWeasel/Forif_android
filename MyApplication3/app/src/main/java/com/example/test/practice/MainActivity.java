package com.example.test.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.text_view);


    }
    public void test(View v) {
        switch (v.getId()) {
            case R.id.AC:
                tv.setText("0");
                break;
            case R.id.one:
                tv.setText(tv.getText() + "1");
                break;
            case R.id.two:
                tv.setText(tv.getText() + "2");
                break;
            case R.id.three:
                tv.setText(tv.getText() + "3");
                break;
            case R.id.four:
                tv.setText(tv.getText() + "4");
                break;
            case R.id.five:
                tv.setText(tv.getText() + "5");
                break;
            case R.id.six:
                tv.setText(tv.getText() + "6");
                break;
            case R.id.seven:
                tv.setText(tv.getText() + "7");
                break;
            case R.id.eight:
                tv.setText(tv.getText() + "8");
                break;
            case R.id.nine:
                tv.setText(tv.getText() + "9");
                break;
            case R.id.zero:
                tv.setText(tv.getText() + "0");
                break;
            case R.id.point:
                Intent intent ;
                intent= new Intent(v.getContext(), SubActivity.class);
                startActivity(intent);
                break;


        }
    }
}

