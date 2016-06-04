package com.goit.gojavaonline.codegym.practice4;

/**
 * Created by tamila on 5/20/16.
 */
public class ColorChain {
    public int count(int N) {
        int[] results = new int[N + 1];
        results[0] = 1;
        if (N >= 1) results[1] = 1;
        if (N >= 2) results[2] = 2;
        if (N >= 3) results[3] = 4;
        if (N >= 4) results[4] = 7;
        if (N >= 5) {
            for (int i = 5; i <= N; i++) {
                results[i] = results[i - 1] + results[i - 2] + results[i - 3];
            }
        }
        return results[N];
    }
}
