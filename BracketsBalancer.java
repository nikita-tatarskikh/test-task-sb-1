package com.nikita;

import java.util.Scanner;
import java.util.Stack;

public class BracketsBalancer {
    public Boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Если скобка открывающася, то помещяем ее сразу в стэк
            if (ch == '(') {
                stack.push(ch);
            }
            //Если при обходе строки вышли в эту ветку, то скобка закрывающася, сразу возвращаем false
            if (stack.empty() && ch == ')') {
                return false;
            }
            //Если при обходе нашли закрывающую скобку, то вынимаем открыващуюся скобку из стэка
            if (ch == ')') {
                stack.pop();
            }
        }
        return stack.empty();
    }


}
