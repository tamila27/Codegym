package com.goit.gojavaonline.codegym.practice4;

/**
 * Created by tamila on 5/21/16.
 */
public class Doubles {
    public Double parse(String s) {
        Double result;
        try {
            result = Double.parseDouble(s);
        } catch (NumberFormatException exception){
            result = null;
        }
        return result;
    }
}
