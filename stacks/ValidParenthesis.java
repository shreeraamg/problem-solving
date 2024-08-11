package stacks;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/
public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(validParenthesis("[(])")); // Invalid
        System.out.println(validParenthesis("[()]{}{[()()]()}")); // Valid
    }

    static boolean validParenthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);

            if (ch == ')' && stack.pop() != '(')
                return false;

            if (ch == ']' && stack.pop() != '[')
                return false;

            if (ch == '}' && stack.pop() != '{')
                return false;
        }

        return stack.empty();
    }
}
