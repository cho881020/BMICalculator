package com.tj.bmicalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private android.widget.EditText heightEdt;
    private android.widget.EditText weightEdt;
    private android.widget.Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();
    }

    void setValues() {
//        초기 데이터 세팅 코드들. (지금 예시에서는 필요 없음)
    }


    void setupEvents() {
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



    void bindViews() {

        this.okBtn = (Button) findViewById(R.id.okBtn);
        this.weightEdt = (EditText) findViewById(R.id.weightEdt);
        this.heightEdt = (EditText) findViewById(R.id.heightEdt);
    }

}
