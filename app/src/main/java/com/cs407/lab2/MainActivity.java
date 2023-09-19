package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void add(View view){
        EditText editText1=(EditText) findViewById(R.id.number1);
        EditText editText2=(EditText) findViewById(R.id.number2);
        double a=Double.parseDouble(editText1.getText().toString());
        double b=Double.parseDouble(editText2.getText().toString());
        double c= a+b;
        goToActivity(""+c);
    }
    public void subtract(View view){
        EditText editText1=(EditText) findViewById(R.id.number1);
        EditText editText2=(EditText) findViewById(R.id.number2);
        double a=Double.parseDouble(editText1.getText().toString());
        double b=Double.parseDouble(editText2.getText().toString());
        double c= a-b;
        goToActivity(""+c);
    }
    public void multiply(View view){
        EditText editText1=(EditText) findViewById(R.id.number1);
        EditText editText2=(EditText) findViewById(R.id.number2);
        double a=Double.parseDouble(editText1.getText().toString());
        double b=Double.parseDouble(editText2.getText().toString());
        double c= a*b;
        goToActivity(""+c);
    }
    public void divide(View view){
        EditText editText1=(EditText) findViewById(R.id.number1);
        EditText editText2=(EditText) findViewById(R.id.number2);
        double a=Double.parseDouble(editText1.getText().toString());
        double b=Double.parseDouble(editText2.getText().toString());
        double c= a/b;
        if(Double.isInfinite(c)){
            Toast.makeText(MainActivity.this,"Divide by Zero error",Toast.LENGTH_LONG).show();
        }
        else {
            goToActivity("" + c);
        }
    }
    public void goToActivity(String s){
        Log.i("INFO",s);
        Intent intent=new Intent(this, CalculatorActivity.class);
        intent.putExtra("result",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}