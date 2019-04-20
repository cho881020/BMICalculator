package com.tj.bmicalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private android.widget.TextView bmiResultTxt;
    private android.widget.TextView bmiCalculateTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        bindViews();
        setupEvents();
        setValues();
    }

    void setupEvents() {

    }

    void setValues() {

//        메인액티비티가 던져준 키/몸무게 받기.

        double height = getIntent().getDoubleExtra("키", 0);
        double weight = getIntent().getDoubleExtra("몸무게", 0);

//        BMI 값을 계산.

        double BMI = weight / ((height / 100) * (height / 100));

//        계산된 BMI값을 출력

        bmiCalculateTxt.setText(String.format("%f 입니다.", BMI));

//        계산된 BMI값을 토대로 비만 여부 판정
        if (BMI < 18.5) {
            bmiResultTxt.setText("저체중");
        }
        else if (BMI < 23) {
            bmiResultTxt.setText("정상");
        }
        else if (BMI < 25) {
            bmiResultTxt.setText("과체중");
        }
        else if (BMI < 30) {
            bmiResultTxt.setText("비만");
        }
        else {
            bmiResultTxt.setText("고도비만");
        }


    }

    void bindViews() {

        this.bmiCalculateTxt = (TextView) findViewById(R.id.bmiCalculateTxt);
        this.bmiResultTxt = (TextView) findViewById(R.id.bmiResultTxt);
    }
}
