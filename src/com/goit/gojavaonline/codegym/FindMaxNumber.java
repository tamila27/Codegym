package com.goit.gojavaonline.codegym;

/**
 * Created by tamila on 4/29/16.
 */
public class FindMaxNumber {
    public int max(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            if(result < input[i]){
                result = input[i];
            }
        }
        return result;
    }
}
