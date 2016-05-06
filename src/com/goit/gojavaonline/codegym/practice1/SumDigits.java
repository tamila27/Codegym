package com.goit.gojavaonline.codegym.practice1;

/**
 * Created by tamila on 4/26/16.
 */
public class SumDigits {
    public int sum(int number) {
        int result = 0;
        long numberToTest = Math.abs((long) number);
        while (numberToTest > 0){
            result += numberToTest % 10;
            numberToTest /= 10;
        }

        return result;
    }
}
