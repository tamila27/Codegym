package com.goit.gojavaonline.codegym.practice1;

/**
 * Created by tamila on 4/29/16.
 */
public class MatrixSnakeTraversal {
    public int[] print(int[][] input) {
        int[] result = new int[input.length * input[0].length];
        int resultIndex = 0;
        for (int j = 0; j < input[0].length; j++) {
            int i = j%2 == 0?0:input.length-1;
            System.out.println("for loop");
            while(true){
                System.out.println("i == "+i+"; j == "+ j);
                System.out.println("resultIndex == "+ resultIndex);
                result[resultIndex] = input[i][j];
                resultIndex++;
                if(j%2 == 0){
                    i++;
                    if (i == input.length) break;
                } else {
                    i--;
                    if(i == -1) break;
                }


            }
        }
        return result;
    }
}
