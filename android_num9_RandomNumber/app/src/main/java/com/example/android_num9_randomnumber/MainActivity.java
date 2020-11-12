package com.example.android_num9_randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.number1);
        btn1.setOnClickListener(clickNum1);

        Button btn2 = (Button)findViewById(R.id.number2);
        btn2.setOnClickListener(clickNum2);

        Button btn3 = (Button)findViewById(R.id.number3);
        btn3.setOnClickListener(clickNum3);

        Button btn4 = (Button)findViewById(R.id.number4);
        btn4.setOnClickListener(clickNum4);

        Button btn5 = (Button)findViewById(R.id.number5);
        btn5.setOnClickListener(clickNum5);

        Button btn6 = (Button)findViewById(R.id.number6);
        btn6.setOnClickListener(clickNum6);

        Button btn7 = (Button)findViewById(R.id.number7);
        btn7.setOnClickListener(clickNum7);

        Button btn8 = (Button)findViewById(R.id.number8);
        btn8.setOnClickListener(clickNum8);

        Button btn9 = (Button)findViewById(R.id.number9);
        btn9.setOnClickListener(clickNum9);

        Button btn_re = (Button)findViewById(R.id.Restart);
        btn_re.setOnClickListener(clickRestart);
    }
    private View.OnClickListener clickNum1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.setNumber);
            number.setText("1");
        }
    };
    private View.OnClickListener clickNum2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.setNumber);
            number.setText("2");
        }
    };
    private View.OnClickListener clickNum3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.setNumber);
            number.setText("3");
        }
    };
    private View.OnClickListener clickNum4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.setNumber);
            number.setText("4");
        }
    };
    private View.OnClickListener clickNum5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.setNumber);
            number.setText("5");
        }
    };
    private View.OnClickListener clickNum6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.setNumber);
            number.setText("6");
        }
    };
    private View.OnClickListener clickNum7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.setNumber);
            number.setText("7");
        }
    };
    private View.OnClickListener clickNum8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.setNumber);
            number.setText("8");
        }
    };
    private View.OnClickListener clickNum9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView number = (TextView)findViewById(R.id.setNumber);
            number.setText("9");
        }
    };
    private View.OnClickListener clickRestart = new View.OnClickListener() {
        @Override

        public void onClick(View v) {
            int count = 0;
        }
    };


    public void clickOut(View v){

        TextView number = (TextView)findViewById(R.id.setNumber);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("NUM", number.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
