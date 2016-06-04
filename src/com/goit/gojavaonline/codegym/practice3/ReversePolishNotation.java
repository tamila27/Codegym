package com.goit.gojavaonline.codegym.practice3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by tamila on 5/20/16.
 */
public class ReversePolishNotation {
    public int evaluate(String expression) {
        if(expression == null || expression.equals(""))
            return 0;

        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<String> operators = new LinkedList<>();

        List<String> tokensList = parseExpression(expression);
        for ( String token: tokensList) {
            if (isOperator(token)) {
                operators.add(token);
                    calculateSimpleExpression(numbers, operators.removeLast());
            } else {
                numbers.add(Integer.parseInt(token));
            }
        }

        while(!operators.isEmpty()) {
            calculateSimpleExpression(numbers, operators.removeLast());
        }

        return numbers.get(0);
    }

    private void calculateSimpleExpression(LinkedList<Integer> numbers, String operator) throws NullPointerException, IllegalArgumentException {
        if(numbers == null || operator == null) {
            throw new NullPointerException();
        }

        if( numbers.size() < 2 && !(operator.equals("+") || operator.equals("-")) ){
            throw new IllegalArgumentException();
        }

        Integer someOne = ( numbers.size() > 0) ? numbers.removeLast() : 0;
        Integer someTwo = ( numbers.size() > 0) ? numbers.removeLast() : 0;
        System.out.println("someOne = "+someOne + "; someTwo = "+ someTwo);

        switch(operator) {
            case "+":
                numbers.add(someTwo + someOne);
                break;
            case "-":
                numbers.add(someTwo - someOne);
                break;
            case "*":
                numbers.add(someTwo * someOne);
                break;
            case "/":
                numbers.add(someTwo / someOne);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    private List<String> parseExpression(String expression){
        StringTokenizer stringTokenizer = new StringTokenizer(expression, "+-*/ ", true);
        List<String> parsedExpression = new ArrayList<>();
        while(stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken().trim();
            if(!token.equals("")){
                parsedExpression.add(token);
            }
        }
        return parsedExpression;
    }

    private boolean isOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }
}
