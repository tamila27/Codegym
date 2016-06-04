package com.goit.gojavaonline.codegym.practice4;

/**
 * Created by tamila on 5/20/16.
 */
public class WordNumber {
    public int count(String input) {
        input = input.toLowerCase();
        System.out.println(input);
        char[] inputsChar = input.toCharArray();
        int result = 0;
        boolean itIsWord = false;
        for (char c: inputsChar) {
            if(c >= 'a' && c <= 'z'){
                itIsWord = true;
            } else if(itIsWord){
                itIsWord = false;
                result++;
            }
        }
        if(itIsWord) result++;
        return result;
    }
}
