package com.dafinoer.javadroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dafinoer.javadroid.format.RupiahConvert;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    private static int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        RupiahConvert rupiahConvert = new RupiahConvert();
        TextView textView = (TextView) findViewById(R.id.textNumber);
        int getValue = Integer.parseInt(textView.getText().toString());
        int tot = getValue * 1000;

        String setToppingName = "Not Use Add Topping";
        CheckBox checkBox = (CheckBox) findViewById(R.id.ice_cone);
        CheckBox checBoxWhiteCreamer = (CheckBox) findViewById(R.id.white_creamer);
        EditText editText = (EditText) findViewById(R.id.input_name);

        if (checkBox.isChecked()){
            tot += 1000;
            setToppingName = "User Topping Cone";
        }
        if(checBoxWhiteCreamer.isChecked()) {
            tot += 500;
            setToppingName = "Use Topping White Cream";
        }

        if(checkBox.isChecked() && checBoxWhiteCreamer.isChecked()){
            setToppingName = "topping cone and white cream";
        }

        rupiahConvert.setMoney(tot);
        setPrice(" hi thanks "+editText.getText()+"\n " +
                setToppingName + "\n"+
                "total price "+rupiahConvert.getConvert());
    }

    private void displayText(int number) {
        TextView textView = (TextView) findViewById(R.id.textNumber);
        textView.setText(Integer.toString(number));
    }

    private void setPrice(String jmlah) {
        TextView textView = (TextView) findViewById(R.id.order_summary_tex_view);
//        int getTot = jmlah * 2000;
        textView.setText(jmlah);
    }

    public void addButton(View view) {
        number += 1;
        try {
            displayText(number);
            Log.d("berhasil", "succes");
        } catch (Exception e) {
            System.out.println(e);
            Log.d("gagal", "fail");
        }

    }

    public void decrementButton(View view) {
        TextView textView = (TextView) findViewById(R.id.textNumber);
        int valueOrder = Integer.parseInt(textView.getText().toString());
        number -= 1;

        try {
            if (valueOrder == 0) {
                Button button = (Button) findViewById(R.id.subtracButton);
                button.setEnabled(true);
            } else {
                displayText(number);
            }
        } catch (Exception e) {
            Log.e("erorr", e.getMessage());
        }
    }


}
