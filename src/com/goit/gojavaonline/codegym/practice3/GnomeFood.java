package com.goit.gojavaonline.codegym.practice3;

/**
 * Created by tamila on 5/20/16.
 */
public class GnomeFood {
    public int[] find(int[] gnames, int[] portions) {
        int count = gnames.length;
        int[] result = new int[gnames.length];
        while(count > 0){
            int maxGnomIndex = 0;
            for (int i = 1; i < gnames.length; i++) {
                if(gnames[maxGnomIndex] < gnames[i] ) maxGnomIndex = i;
            }
            int maxPortionIndex = 0;
            for (int i = 0; i < portions.length; i++) {
                if(portions[maxPortionIndex] < portions[i] ) maxPortionIndex = i;
            }
            result[maxGnomIndex] = maxPortionIndex;
            gnames[maxGnomIndex] = 0;
            portions[maxPortionIndex] = 0;
            count--;
        }
        return result;
    }
}
