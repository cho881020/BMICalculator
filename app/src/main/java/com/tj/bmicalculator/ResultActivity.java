package com.tj.bmicalculator;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tj.bmicalculator.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

        binding.bmiCalculateTxt.setText(String.format("%f 입니다.", BMI));

//        계산된 BMI값을 토대로 비만 여부 판정
        if (BMI < 18.5) {
            binding.bmiResultTxt.setText("저체중");
        }
        else if (BMI < 23) {
            binding.bmiResultTxt.setText("정상");
        }
        else if (BMI < 25) {
            binding.bmiResultTxt.setText("과체중");
        }
        else if (BMI < 30) {
            binding.bmiResultTxt.setText("비만");
        }
        else {
            binding.bmiResultTxt.setText("고도비만");
        }


    }

    void bindViews() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_result);

    }
}
