package com.tj.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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

//                확인버튼을 누르면? => ResultActivity로 키/몸무게를 들고 이동

//                1) 입력된 키가 몇인지 소수점으로 저장
//                1.1) heightEdt에 입력된 값을 일단 String으로 뽑아오자.
                String heightStr = heightEdt.getText().toString();

//                1.2) 따낸 String을 double 형태로 변환.

                double height = Double.parseDouble(heightStr);

//                1.3) 몸무게도 키와 같은 방식으로 소수점 추출
                String weightStr = weightEdt.getText().toString();
                double weight = Double.parseDouble(weightStr);

//                2) 인텐트를 만들고, 따낸 키와 몸무게를 첨부.
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("키", height);
                intent.putExtra("몸무게", weight);
                startActivity(intent);

            }
        });
    }



    void bindViews() {

        this.okBtn = (Button) findViewById(R.id.okBtn);
        this.weightEdt = (EditText) findViewById(R.id.weightEdt);
        this.heightEdt = (EditText) findViewById(R.id.heightEdt);
    }

}
