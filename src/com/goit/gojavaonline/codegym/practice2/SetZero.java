package com.goit.gojavaonline.codegym.practice2;

/**
 * Created by tamila on 5/13/16.
 */
public class SetZero {
    public int set(int num, int i) {
        /*char[] binaryNum = Integer.toBinaryString(num).toCharArray();
        int index = i - binaryNum.length;
        if(index <= 0) binaryNum[i-1] = '0';

        return Integer.parseInt(String.copyValueOf(binaryNum), 2);*/

        /*char[] binaryNum = Integer.toBinaryString(num).toCharArray();
        char[] binaryNum32 = new char[32];
        for (int j = 0; j < binaryNum32.length; j++) {
            binaryNum32[j] = '0';

        }
        for (int j = 0; j < binaryNum.length; j++) {
            binaryNum32[ 32 - binaryNum.length + j ] = binaryNum[j];
        }
        binaryNum32[32 - i] = '0';

        return Integer.parseInt(String.copyValueOf(binaryNum32), 2);*/
        //return num ^ 1 << (32 - i);
        /*char[] binaryNum = Integer.toBinaryString(num).toCharArray();
        char[] binaryNum32 = new char[32];
        for (int j = 0; j < binaryNum32.length; j++) {
            binaryNum32[j] = '0';

        }
        for (int j = 0; j < binaryNum.length; j++) {
            binaryNum32[ 32 - binaryNum.length + j ] = binaryNum[j];
        }
        binaryNum32[32 - i] = '0';
        if(num < 0){
            for (int j = 1; j < binaryNum32.length; j++) {
                binaryNum32[j] = (binaryNum32[j] == '0'?'1':'0');
            }
        }

        Long result = Long.parseLong(String.copyValueOf(binaryNum32), 2);
        return num < 0 ? result.intValue() * (-1) - 1: result.intValue();*/

        char[] maskArray = new char[32];
        for(int j=0;j<32;j++){
            if(j==32-i) maskArray[j]='0';
            else maskArray[j]='1';
        }
        String maskString = new String(maskArray);
        Long mask = Long.parseLong(maskString,2);
        return num & mask.intValue();
    }
}
