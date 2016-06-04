package com.goit.gojavaonline.codegym.practice5;

/**
 * Created by tamila on 5/21/16.
 */
public class KmpSmallestPeriod {
    public String findSmalletstPeriod(String input) {
        String result;
        int startIndex = 0;
        int endIndex = 1;

        while (true){
            result = input.substring(startIndex, endIndex);
            String stringToCompare = input.substring(endIndex, endIndex + result.length());

            if(result.equals(stringToCompare)){
                break;
            } else {
                endIndex++;
            }
        }
        return result;
    }
}
