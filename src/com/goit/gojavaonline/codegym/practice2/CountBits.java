package com.goit.gojavaonline.codegym.practice2;

public class CountBits {
    public int count(int num) {
        int result = 0;
        while (num != 0) {
            result += num & 1;
            num = num >>> 1;
        }
        return result;

    }
}
