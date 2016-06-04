package com.goit.gojavaonline.codegym.practice3;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by tamila on 5/19/16.
 */
public class UnixPath {
    public String simplify(String input) {
        Deque<String> stringDeque = new LinkedList<>();
        String[] path = input.split("/");

        for (String currentName : path) {
            if (currentName.equals("..")) {
                if (!stringDeque.isEmpty()) {
                    stringDeque.pop();
                }
            } else if (currentName.equals("") || currentName.equals(".")) {
                // do nothing
            } else {
                stringDeque.push(currentName);
            }
        }

        StringBuilder result = new StringBuilder();
        while (true) {
            if (!(result.length() > 1 && stringDeque.isEmpty())) {
                result.append("/");
            }
            if (!stringDeque.isEmpty()) {
                result.append(stringDeque.removeLast());
            } else {
                break;
            }
        }
        return result.toString();
    }
}
