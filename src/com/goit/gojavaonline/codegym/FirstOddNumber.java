package com.goit.gojavaonline.codegym;

/**
 * Created by tamila on 4/28/16.
 */
public class FirstOddNumber {
    public int find(int[] input) {
        int resultIndex = -1;
        if(input != null){
            for (int i = 0; i < input.length; i++) {
                if(input[i] % 2 > 0){
                    return i;
                }
            }
        }

        return resultIndex;
    }
}
