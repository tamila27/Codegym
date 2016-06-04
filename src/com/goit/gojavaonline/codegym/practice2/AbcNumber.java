package com.goit.gojavaonline.codegym.practice2;

/**
 * Created by tamila on 5/13/16.
 */
public class AbcNumber {
    private static final char[] NUMBERS_TO_LETTERS = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    public int convert(String num) {
        char[] letters = num.toCharArray();
        String resultNumber = "";
        for (char letter: letters) {
            resultNumber += (letter -'a');
            System.out.println(resultNumber);
        }

        return Integer.parseInt(resultNumber);
    }
}
