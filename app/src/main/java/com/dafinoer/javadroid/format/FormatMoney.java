package com.dafinoer.javadroid.format;

/**
 * Created by dafinoer on 09/12/17.
 */

public class FormatMoney {
    private double money;
    private String formatString;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getFormatString(){
        return formatString;
    }
    public void setFormatString(String formatString){
        this.formatString = formatString;
    }
}
