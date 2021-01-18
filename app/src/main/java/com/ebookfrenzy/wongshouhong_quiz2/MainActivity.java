package com.ebookfrenzy.wongshouhong_quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Double result = 0.00;

    public void calculation1(View view) {
        TextView output = findViewById(R.id.textView);
        EditText input1 = findViewById(R.id.Input1);
        EditText input2 = findViewById(R.id.Input2);
        EditText input3 = findViewById(R.id.Input3);

        if (!input1.getText().toString().equals("")&&!input2.getText().toString().equals("")&&!input3.getText().toString().equals("")) {

            Double i1 =Double.valueOf(input1.getText().toString());
            Double i2 =Double.valueOf(input2.getText().toString());
            Double i3 =Double.valueOf(input3.getText().toString());
            result = i1+i2+i3;
            output.setText(result.toString());
        }
        else {
            output.setText("No Value");
        }
    }

    public void calculation2(View view) {
        TextView output = findViewById(R.id.textView);
        EditText input1 = findViewById(R.id.Input1);
        EditText input2 = findViewById(R.id.Input2);
        EditText input3 = findViewById(R.id.Input3);
        if (!input1.getText().toString().equals("")&&!input2.getText().toString().equals("")&&!input3.getText().toString().equals("")) {
            if (!input1.getText().toString().equals("")&&!input2.getText().toString().equals("")&&!input3.getText().toString().equals("")) {
                if(input1.getText().toString().equals(""))
                    input1.getText().toString().equals("0");
                else if(input2.getText().toString().equals(""))
                    input2.getText().toString().equals("0");
                else if(input3.getText().toString().equals(""))
                    input3.getText().toString().equals("0");
                Double i1 =Double.valueOf(input1.getText().toString());
                Double i2 =Double.valueOf(input2.getText().toString());
                Double i3 =Double.valueOf(input3.getText().toString());
                result = i1-i2+i3;
                output.setText(result.toString());
            }
            else {
                output.setText("No Value");
            }
        }

        public void calculation3(View view) {
            TextView output = findViewById(R.id.textView);
            EditText input1 = findViewById(R.id.Input1);
            EditText input2 = findViewById(R.id.Input2);
            EditText input3 = findViewById(R.id.Input3);
            if (!input1.getText().toString().equals("")&&!input2.getText().toString().equals("")&&!input3.getText().toString().equals("")) {
                Double i1 =Double.valueOf(input1.getText().toString());
                Double i2 =Double.valueOf(input2.getText().toString());
                Double i3 =Double.valueOf(input3.getText().toString());
                result = i1*i2-i3;
                output.setText(result.toString());
            }
            else {
                output.setText("No Value");
            }
        }
    }