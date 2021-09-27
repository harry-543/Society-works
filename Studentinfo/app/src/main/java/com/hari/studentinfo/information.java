package com.hari.studentinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class information extends AppCompatActivity
{
    TextView informationfrommain;
    TextView info1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        informationfrommain = findViewById(R.id.informationfrommain);
        info1 = findViewById(R.id.info1);
        String input1 =  getIntent().getStringExtra("from_main1");
        String input2 = getIntent().getStringExtra("from_main2");

        informationfrommain.setText(input2);
        info1.setText(input1);
    }
}
