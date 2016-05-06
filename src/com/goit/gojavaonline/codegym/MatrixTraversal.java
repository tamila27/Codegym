package com.goit.gojavaonline.codegym;

/**
 * Created by tamila on 4/29/16.
 */
public class MatrixTraversal {
    /*public int[] print(int[][] input) {
        int[] result = new int[input.length * input[0].length];
        int resultIndex = 0;

        int minForRow = 0;
        int maxForRow = input.length-1;
        int rowCoef = 1;

        int minForColumn = 0;
        int maxForColumn = input[0].length-1;
        int columnCoef = 1;

        boolean rowFixed = true;
        boolean columnFixed = false;

        int i = minForRow;
        int j = minForColumn;

        boolean hasNextStep = true;

        while(hasNextStep){
            System.out.println("input [ "+i+", "+ j+" ] == "+ input[i][j] + ";     minR == "+ minForRow + "; maxR == "+maxForRow+ ";     minC == "+ minForColumn + "; maxC == "+maxForColumn);
            result[resultIndex++] = input[i][j];

            if(rowFixed){
                j+=columnCoef;
                if(j < minForColumn){
                    columnFixed = true;
                    rowFixed = false;
                    columnCoef = 1;
                    minForColumn++;
                    j+=columnCoef;
                    i+=rowCoef;
                } else if(j > maxForColumn){
                    columnFixed = true;
                    rowFixed = false;
                    columnCoef = -1;
                    maxForColumn--;
                    j+=columnCoef;
                    i+=rowCoef;
                }
            } else if(columnFixed){
                i+=rowCoef;
                if(i < minForRow){
                    columnFixed = false;
                    rowFixed = true;
                    rowCoef = 1;
                    minForRow++;
                    i+=rowCoef;
                    j+=columnCoef;
                } else if(i > maxForRow){
                    columnFixed = false;
                    rowFixed = true;
                    rowCoef = -1;
                    maxForRow--;
                    i+=rowCoef;
                    j+=columnCoef;
                }
            }

            if(minForRow == maxForRow && minForColumn == maxForColumn) {
                hasNextStep =
            };
        }

        return result;

    }*/

    public int[] print(int[][] input) {
        int[] result = new int[input.length * input[0].length];
        int resultIndex = 0;

        int minForRow = -1;
        int maxForRow = input.length;

        int minForColumn = -1;
        int maxForColumn = input[0].length;
        boolean movingToRight = true;
        boolean movingToDown = true;

        boolean isHorizontalDirection = true;

        int column = minForColumn + 1, row = minForRow + 1;
        while ((minForRow != maxForRow || minForColumn != maxForColumn) && resultIndex < result.length) {
            if (isHorizontalDirection) {
                if (movingToRight) {
                    if (column < maxForColumn) {
                        result[resultIndex++] = input[row][column++];
                    } else {
                        isHorizontalDirection = false;
                        movingToRight = false;
                        movingToDown = true;
                        minForRow++;
                        row++;
                        column--;
                    }
                } else {
                    if (column > minForColumn) {
                        result[resultIndex++] = input[row][column--];
                    } else {
                        isHorizontalDirection = false;
                        movingToRight = true;
                        movingToDown = false;
                        maxForRow--;
                        row--;
                        column++;
                    }
                }
            } else {
                if (movingToDown) {
                    if (row < maxForRow) {
                        result[resultIndex++] = input[row++][column];
                    } else {
                        isHorizontalDirection = true;
                        movingToDown = false;
                        movingToRight = false;
                        maxForColumn--;
                        column--;
                        row--;
                    }
                } else {
                    if (row > minForRow) {
                        result[resultIndex++] = input[row--][column];
                    } else {
                        isHorizontalDirection = true;
                        movingToDown = true;
                        movingToRight = true;
                        minForColumn++;
                        column++;
                        row++;
                    }
                }
            }

        }

        return result;

    }
    /*public int[] print(int[][] input) {

    }*/
}
