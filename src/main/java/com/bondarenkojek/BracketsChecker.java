package com.bondarenkojek;

import java.util.Stack;

public class BracketsChecker {
    public boolean checkBrackets(String data) {
        if (data == null) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        char c;
        for (int i = 0; i < data.length(); i++) {
            c = data.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (c == ')') {
                    if (stack.empty()) {
                        return false;
                    } else {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return stack.empty();
    }
}
