package com.dafinoer.javadroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view){
        displayText(2);
        setPrice(4);
    }

    private void displayText(int number){
        TextView textView = (TextView) findViewById(R.id.textNumber);
        textView.setText(Integer.toString(number));
    }

    private void setPrice(int jmlah){
        TextView textView = (TextView) findViewById(R.id.price);
        int getTot = jmlah * 2000;
        textView.setText(Integer.toString(getTot));
    }

    public void addButton(View view){
        TextView textView = (TextView) findViewById(R.id.textNumber);
        int valueOrder = Integer.parseInt(textView.getText().toString());
        valueOrder += 1;

        try{
            displayText(valueOrder);
            Log.d("berhasil", "succes");
        }catch (Exception e){
            System.out.println(e);
            Log.d("gagal", "fail");
        }

    }

}
