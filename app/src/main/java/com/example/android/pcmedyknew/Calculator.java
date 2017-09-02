package com.example.android.pcmedyknew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by Mateusz Ławniczak on 02.09.2017.
 */

    public class Calculator extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.calculator);

            Button button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    order();
                }
            });
        }

        public void order(){

            CheckBox o1 = (CheckBox) findViewById(R.id.o1);
            boolean op1 = o1.isChecked();

            CheckBox o2 = (CheckBox) findViewById(R.id.o2);
            boolean op2 = o2.isChecked();

            CheckBox o3 = (CheckBox) findViewById(R.id.o3);
            boolean op3 = o3.isChecked();

            CheckBox o4 = (CheckBox) findViewById(R.id.o4);
            boolean op4 = o4.isChecked();

            CheckBox o5 = (CheckBox) findViewById(R.id.o5);
            boolean op5 = o5.isChecked();

            CheckBox o6 = (CheckBox) findViewById(R.id.o6);
            boolean op6 = o6.isChecked();

            CheckBox o7 = (CheckBox) findViewById(R.id.o7);
            boolean op7 = o7.isChecked();

            CheckBox o8 = (CheckBox) findViewById(R.id.o8);
            boolean op8 = o8.isChecked();

            CheckBox o9 = (CheckBox) findViewById(R.id.o9);
            boolean op9 = o9.isChecked();

            CheckBox o10 = (CheckBox) findViewById(R.id.o10);
            boolean op10 = o10.isChecked();

            CheckBox o11 = (CheckBox) findViewById(R.id.o11);
            boolean op11 = o11.isChecked();

            CheckBox o12 = (CheckBox) findViewById(R.id.o12);
            boolean op12 = o12.isChecked();

            int price = calculatePrice(op1, op2, op3, op4, op5, op6, op7, op8, op9, op10, op11, op12);

            TextView textView = (TextView) findViewById(R.id.razem);
            textView.setText(String.valueOf(price));
        }

        private static int calculatePrice(boolean o1, boolean o2, boolean o3, boolean o4, boolean o5,
                                          boolean o6, boolean o7, boolean o8, boolean o9, boolean o10,
                                          boolean o11, boolean o12){
            int sum = 0;
            if (o1){
                sum += 50;
            }
            if (o2){
                sum += 50;
            }
            if (o3){
                sum += 50;
            }
            if (o4){
                sum += 50;
            }
            if (o5){
                sum += 50;
            }
            if (o6){
                sum += 50;
            }
            if (o7){
                sum += 50;
            }
            if (o8){
                sum += 50;
            }
            if (o9){
                sum += 50;
            }
            if (o10){
                sum += 50;
            }
            if (o11){
                sum += 50;
            }
            if (o12){
                sum += 50;
            }
            return sum;
        }
    }
