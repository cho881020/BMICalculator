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

    }

    void bindViews() {

        this.bmiCalculateTxt = (TextView) findViewById(R.id.bmiCalculateTxt);
        this.bmiResultTxt = (TextView) findViewById(R.id.bmiResultTxt);
    }
}
