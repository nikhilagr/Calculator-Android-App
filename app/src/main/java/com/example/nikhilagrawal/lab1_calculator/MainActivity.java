package com.example.nikhilagrawal.lab1_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonClear;
    private Button buttonAdd;
    private Button buttonDiv;
    private Button buttonSub;
    private Button buttonMul;
    private Button buttonEqual;


    private EditText editText;
    private StringBuilder sb = new StringBuilder();
    private double firstNum = 0;
    private boolean add,mul,div,sub;
    private double number = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext_result);
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        buttonAdd = findViewById(R.id.button_add);
        buttonSub = findViewById(R.id.button_sub);
        buttonMul = findViewById(R.id.button_mul);
        buttonDiv = findViewById(R.id.button_div);
        buttonClear = findViewById(R.id.button_clear);
        buttonEqual = findViewById(R.id.button_equal);

        button0.setOnClickListener(customOnClickListener);
        button1.setOnClickListener(customOnClickListener);
        button2.setOnClickListener(customOnClickListener);
        button3.setOnClickListener(customOnClickListener);
        button4.setOnClickListener(customOnClickListener);
        button5.setOnClickListener(customOnClickListener);
        button6.setOnClickListener(customOnClickListener);
        button7.setOnClickListener(customOnClickListener);
        button8.setOnClickListener(customOnClickListener);
        button9.setOnClickListener(customOnClickListener);
        buttonClear.setOnClickListener(customOnClickListener);
        buttonAdd.setOnClickListener(customOnClickListener);
        buttonSub.setOnClickListener(customOnClickListener);
        buttonMul.setOnClickListener(customOnClickListener);
        buttonDiv.setOnClickListener(customOnClickListener);
        buttonEqual.setOnClickListener(customOnClickListener);

    }


    private View.OnClickListener customOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){

                case  R.id.button_0:
                    editText.setText(editText.getText()+"0");
                    break;

                case R.id.button_1:
                    editText.setText(editText.getText()+"1");
                    break;
                case R.id.button_2:

                    editText.setText(editText.getText()+"2");
                    break;
                case R.id.button_3:


                    editText.setText(editText.getText()+"3");
                    break;
                case R.id.button_4:


                    editText.setText(editText.getText()+"4");
                    break;
                case R.id.button_5:


                    editText.setText(editText.getText()+"5");
                    break;
                case R.id.button_6:

                    editText.setText(editText.getText()+"6");
                    break;
                case R.id.button_7:

                    editText.setText(editText.getText()+"7");
                    break;
                case R.id.button_8:

                    editText.setText(editText.getText()+"8");
                    break;
                case R.id.button_9:

                    editText.setText(editText.getText()+"9");
                    break;

                case R.id.button_clear:
                    editText.setText("");
                    break;

                case R.id.button_add:

                    if (editText == null) {
                        editText.setText("");
                    } else {
                        firstNum = Double.parseDouble(editText.getText() + "");
                        add = true;
                        editText.setText(null);
                    }


                    break;


                case R.id.button_sub:

                    if (editText == null) {
                        editText.setText("");
                    } else {
                        firstNum = Double.parseDouble(editText.getText() + "");
                        sub = true;
                        editText.setText(null);
                    }
                    break;

                case R.id.button_mul:

                    if (editText == null) {
                        editText.setText("");
                    } else {
                        firstNum = Double.parseDouble(editText.getText() + "");
                        mul = true;
                        editText.setText(null);
                    }
                    break;

                case R.id.button_div:

                    if (editText == null) {
                        editText.setText("");
                    } else {
                        firstNum = Double.parseDouble(editText.getText() + "");
                        div = true;
                        editText.setText(null);
                    }
                    break;

                case R.id.button_equal:

                    double secondNum = Double.parseDouble(editText.getText().toString());
                    double result = 0;
                    if(add){
                        result = firstNum + secondNum;
                        add = false;
                    }else if(sub){
                        result = firstNum - secondNum;
                        sub = false;
                    }else if(mul){
                        result = firstNum * secondNum;
                        mul = false;
                    }else if(div){
                        result = firstNum / secondNum;
                        div = false;
                    }

                    editText.setText(String.valueOf(result));

                    return;

            }
        }
    };


}
