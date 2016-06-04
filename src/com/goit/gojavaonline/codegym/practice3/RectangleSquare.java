package com.goit.gojavaonline.codegym.practice3;

/**
 * Created by tamila on 5/20/16.
 */
public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < x.length; i++) {
            if(maxX < x[i]+w[i]) maxX = x[i] + w[i];
        }
        for (int i = 0; i < h.length; i++) {
            if(maxY < h[i]) maxY = h[i];
        }

        int resultSquare = 0;

        boolean[][] coordinatesPlane = new boolean[maxX][maxY];

        for (int i = 0; i < x.length; i++) {
            int xEndIndex = x[i] + w[i];
            int yEndIndex = h[i];
            for (int j = x[i]; j < xEndIndex; j++) {
                for (int k = 0; k < yEndIndex; k++) {
                    if(!coordinatesPlane[j][k]) resultSquare++;
                    coordinatesPlane[j][k] = true;
                }
            }
        }

        System.out.println(resultSquare);
        return resultSquare;
        /*int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < x.length; i++) {
            if(maxX < x[i]+w[i]) maxX = x[i] + w[i];
        }
        for (int i = 0; i < h.length; i++) {
            if(maxY < h[i]) maxY = h[i];
        }

        boolean[][] coordinatesPlane = new boolean[maxX][maxY];

        for (int i = 0; i < x.length; i++) {
            int xEndIndex = x[i] + w[i];
            int yEndIndex = h[i];
            for (int j = x[i]; j < xEndIndex; j++) {
                for (int k = 0; k < yEndIndex; k++) {
                    coordinatesPlane[j][k] = true;
                }
            }
        }
        int resultSquare = 0;
        for (int i = 0; i < coordinatesPlane.length; i++) {
            for (int j = 0; j < coordinatesPlane[0].length; j++) {
                if(coordinatesPlane[i][j]) resultSquare++;
            }
        }

        System.out.println(resultSquare);
        return resultSquare;*/
    }
}
