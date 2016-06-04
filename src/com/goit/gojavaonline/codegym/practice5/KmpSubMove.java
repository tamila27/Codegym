package com.goit.gojavaonline.codegym.practice5;

/**
 * Created by tamila on 5/24/16.
 */
public class KmpSubMove {
    public int subMoveQuantity(String inputStr, String resultStr) {
        int count = 0;

        StringBuilder str = new StringBuilder(inputStr);

        while (count < inputStr.length()){
            if(inputStr.equals(resultStr)){
                return count;
            } else {
                str.delete(0, str.length());
                str.append(inputStr.substring(inputStr.length()-1));
                str.append(inputStr.substring(0, inputStr.length() - 1));

                inputStr = str.toString();
                count++;
            }
        }

        return -1;
    }
}
