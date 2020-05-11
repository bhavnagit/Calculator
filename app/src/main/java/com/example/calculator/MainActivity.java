package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etfirstvalue , etSecondvalue ;
    TextView tvAns ;
    Button Add, Subtract , Multiplty , Divide ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirstvalue = findViewById(R.id.etFirstValue);
        etSecondvalue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        Add = findViewById(R.id.btnAdd);
        Subtract= findViewById(R.id.btnSub);
        Multiplty= findViewById(R.id.btnMultiply);
        Divide = findViewById(R.id.btnDivide);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue , ans ;
                firstValue = Integer.parseInt(etfirstvalue.getText().toString());
                secondValue = Integer.parseInt(etSecondvalue.getText().toString());
                ans = firstValue + secondValue;
                tvAns.setText(" Ans is = "+ ans);

            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue , ans ;
                firstValue = Integer.parseInt(etfirstvalue.getText().toString());
                secondValue = Integer.parseInt(etSecondvalue.getText().toString());
                ans = firstValue - secondValue;
                tvAns.setText(" Ans is = "+ ans);

            }
        });

        Multiplty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue , ans ;
                firstValue = Integer.parseInt(etfirstvalue.getText().toString());
                secondValue = Integer.parseInt(etSecondvalue.getText().toString());
                ans = firstValue * secondValue;
                tvAns.setText(" Ans is = "+ ans);

            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue , secondValue , ans ;
                firstValue = Integer.parseInt(etfirstvalue.getText().toString());
                secondValue = Integer.parseInt(etSecondvalue.getText().toString());
                ans = firstValue / secondValue;
                tvAns.setText(" Ans is = "+ ans);

            }
        });

    }
}
