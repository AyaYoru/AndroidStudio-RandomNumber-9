package com.example.android_num9_randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        num_ans();
    }

    public void clickBack(View v){
        finish();
    }

    private void num_ans(){
        int number;
        Random num = new Random();
        int ans = num.nextInt((10)+1);
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){

            number = Integer.parseInt(bundle.getString("NUM"));
            TextView TF = (TextView)findViewById(R.id.ToF);
            TextView BoS = (TextView)findViewById(R.id.BoS);
            if (number == ans){
                BoS.setText("答對了");
                TF.setText("○");
            }
            else if (number > ans){
                BoS.setText("猜小點");
                TF.setText("X");
            }
            else if (number < ans){
                BoS.setText("猜大點");
                TF.setText("X");
            }
        }
    }
}