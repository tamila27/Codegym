package com.goit.gojavaonline.codegym.practice3;

/**
 * Created by tamila on 5/19/16.
 */
public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        int stableTime = 1;
        int maxStableTime = 1;
        int diff;
        int maxValue;
        int minValue;
        for (int i = 0; i < gdp.length - 1; i++) {
            minValue = gdp[i];
            maxValue = gdp[i];
            //System.out.println("max = "+ maxStableTime + "; st = "+ stableTime);
            if (stableTime > maxStableTime) {
                maxStableTime = stableTime;
            }
            stableTime = 1;
            for (int j = i; j < gdp.length - 1; j++) {
                if (minValue > gdp[j + 1]) minValue = gdp[j + 1];
                if (maxValue < gdp[j + 1]) maxValue = gdp[j + 1];
                diff = maxValue - minValue;
                if (diff == 0 || diff == 1) {
                    stableTime++;
                    //System.out .println(" gdp[" +i + "] == " + gdp[i] + ";   gdp["+(j+1)+"] == "+ gdp[j+1]);
                    //System.out.println(" i = "+ i + "; j = "+ j + "; stableTime == "+ stableTime);
                } else {
                    //stableTime--;
                    break;
                }
            }
        }
        return maxStableTime;
        /*int result = 0;
        if (gdp.length == 0) {
            return 0;
        }
        if (gdp.length == 1) {
            return 1;
        }
        int tmpResult = 0;
        for (int i = 0; i < gdp.length; i++) {
            int min = gdp[i];
            int max = gdp[i];
            for (int j = i; j < gdp.length; j++) {
                if (gdp[j] > max) max = gdp[j];
                if (gdp[j] < min) min = gdp[j];
                if ((max - min) > 1) {
                    if (tmpResult > result) result = tmpResult;
                    tmpResult = 0;
                    break;
                }
                if ((gdp[i] - gdp[j]) >= -1 && (gdp[i] - gdp[j]) <= 1) {
                    tmpResult++;
                }
            }
        }
        return result;*/
    }
}
