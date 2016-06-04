package com.goit.gojavaonline.codegym.practice2;

import java.util.Arrays;

/**
 * Created by tamila on 5/6/16.
 */
public class AddNumberBase36 {

    public String[] DIGITS = new String[]{"0", "1", "2", "3", "4", "5", "6", "7",
                         "8", "9",
                         "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                         "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                         "u", "v", "w", "x", "y", "z"};

    public String add(String a, String b) {

        String longestNumber = (a.length() > b.length()?a.toLowerCase():b.toLowerCase());
        String shortestNumber = (a.length() > b.length()?b.toLowerCase():a.toLowerCase());
        String extraNumber = "0";
        String number = "";
        for (int i = 0; i < longestNumber.length() - shortestNumber.length(); i++) {
            number += "0";
        }
        number += shortestNumber;
        String resultNumber = "";
        for (int i = longestNumber.length()-1; i >=0 ; i--) {
            String addingResult = addDigits(longestNumber.charAt(i), addDigits(extraNumber.charAt(0), number.charAt(i)).charAt(1));
            extraNumber = addingResult.substring(0, 1);
            resultNumber = (i==0 && extraNumber.equals("1")?"1":"")+String.valueOf(addingResult.charAt(1)) + resultNumber;
        }

        return resultNumber;
    }

    private String addDigits(char a, char b){
        int indexOfA = Arrays.asList(DIGITS).indexOf( String.valueOf(a) );
        int indexOfB = Arrays.asList(DIGITS).indexOf( String.valueOf(b) );

        return Arrays.asList(DIGITS).get((indexOfA + indexOfB)/36)+Arrays.asList(DIGITS).get((indexOfA + indexOfB)%36);
    }
}
