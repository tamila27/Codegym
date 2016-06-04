package com.goit.gojavaonline.codegym.practice2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tamila on 5/19/16.
 */
public class AddBinary {

    public String add(String a, String b) {
        List<Integer> argumentA = new ArrayList<>();
        List<Integer> argumentB = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = a.length() - 1; i >= 0; i--) {
            argumentA.add(a.charAt(i) - '0');
        }
        for (int i = b.length() - 1; i >= 0; i--) {
            argumentB.add(b.charAt(i) - '0');
        }
        for (int i = 0; i < Math.max(argumentA.size(), argumentB.size()); i++) {
            if (argumentA.size() - 1 < i) {
                argumentA.add(0);
            }
            if (argumentB.size() - 1 < i) {
                argumentA.add(0);
            }

            result.add((argumentA.get(i) + argumentB.get(i) + result.get(i)) / 2);
            result.set(i, (argumentA.get(i) ^ argumentB.get(i) ^ result.get(i)));
        }
        if (result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }
        StringBuilder stringResult = new StringBuilder();
        for (int i = result.size() - 1; i >= 0; i--) {
            stringResult.append(result.get(i));
        }
        return stringResult.toString();
    }

}
