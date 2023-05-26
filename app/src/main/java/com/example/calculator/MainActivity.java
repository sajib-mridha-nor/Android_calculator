package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    Double num1,num2,ans;
    char c='0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result= (TextView) findViewById(R.id.tv1);

    }
    public void numone(View view){
        String s = result.getText().toString();
        result.setText(s+1);
    }
    public void numtwo(View view){
        String s = result.getText().toString();
        result.setText(s+2);
    }
    public void numthree(View view){
        String s = result.getText().toString();
        result.setText(s+3);
    }
    public void numfour(View view){
        String s = result.getText().toString();
        result.setText(s+4);
    }
    public void numfive(View view){
        String s = result.getText().toString();
        result.setText(s+5);
    }
    public void numsix(View view){
        String s = result.getText().toString();
        result.setText(s+6);
    }
    public void numseven(View view){
        String s = result.getText().toString();
        result.setText(s+7);
    }
    public void numeight(View view){
        String s = result.getText().toString();
        result.setText(s+8);
    }
    public void numnine(View view){
        String s = result.getText().toString();
        result.setText(s+9);

    }
    public void numzero(View view) {

        String s = result.getText().toString();
        if (s.length() != 0) {
            result.setText(s + "0");
        }
    }
    public void clear(View view){

        result.setText("");
    }
    public void back(View view) {
        String s = result.getText().toString();
        if (s.length() != 0) {
            s = s.substring(0, s.length() - 1);
            result.setText(s);
        }
    }

    public void numplus(View view){
        String s = result.getText().toString();
        num1=Double.parseDouble(s);
        result.setText(" ");
        c='+';
    }
    public void numMinus(View view){
        String s = result.getText().toString();
        num1=Double.parseDouble(s);
        result.setText(" ");
        c='-';
    }
    public void numMultiply(View view){
        String s = result.getText().toString();
        num1=Double.parseDouble(s);
        result.setText(" ");
        c='*';
    }
    public void numdivided(View view){
        String s = result.getText().toString();
        num1=Double.parseDouble(s);
        result.setText(" ");
        c='/';
    } public void numequal(View view){

        if (c!='0'){
            String s = result.getText().toString();
            num2=Double.parseDouble(s);
            if (c=='+'){
                ans=num1+num2;
                s=String.valueOf(ans);
                result.setText(s);
                c='0';
            } if (c=='-'){
                ans=num1-num2;
                s=String.valueOf(ans);
                result.setText(s);
                c='0';
            } if (c=='*'){
                ans=num1*num2;
                s=String.valueOf(ans);
                result.setText(s);
                c='0';
            } if (c=='/'){
                ans=num1/num2;
                s=String.valueOf(ans);
                result.setText(s);
                c='0';
            }

        }

    }

}
