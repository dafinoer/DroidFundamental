package com.dafinoer.javadroid.format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Created by dafinoer on 09/12/17.
 */

public class RupiahConvert extends FormatMoney implements ConvertImpl {

    @Override
    public String getConvert() {
        DecimalFormat rupiahSetUp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols idrSymbol = new DecimalFormatSymbols();
        idrSymbol.setCurrencySymbol("Rp.");
        idrSymbol.setMonetaryDecimalSeparator(',');
        idrSymbol.setGroupingSeparator('.');
        rupiahSetUp.setDecimalFormatSymbols(idrSymbol);
        String getValueForamt = rupiahSetUp.format(getMoney());

        return getValueForamt;
    }
}
