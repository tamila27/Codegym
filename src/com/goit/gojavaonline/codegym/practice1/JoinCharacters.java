package com.goit.gojavaonline.codegym.practice1;

/**
 * Created by tamila on 4/26/16.
 */
public class JoinCharacters {
    private final static int CODE_OF_ZERO = (int)'0';
    public int join(char[] input) {
        int result = 0;
        for (char anInput : input) {
            result = result * 10 + (anInput - CODE_OF_ZERO);
        }
        return result;
    }
}
