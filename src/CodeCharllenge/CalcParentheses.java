package CodeCharllenge;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <p>
 * This problem was asked by Google.
 * <p>
 * Given a string of parentheses, write a function to compute the minimum number of parentheses to be removed to make
 * the string valid (i.e. each open parenthesis is eventually closed).
 * <p>
 * For example, given the string "()())()", you should return 1. Given the string ")(", you should return 2,
 * since we must remove all of them.
 */
public class CalcParentheses {

    private static String target = "()())()";
    private static String target1 = ")(";

    public static void main(String[] args) {
        int notMatched = validate(target.toCharArray());
        System.out.println(target + " : " + notMatched);

        System.out.println(target1 + " : " + validate(target1.toCharArray()));
    }

    public static int validate(char[] chars) {
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()) {
                stack.push(chars[i]);
                continue;
            }
            if (chars[i] == ')' && stack.peek() == '(') stack.pop();
            else stack.push(chars[i]);
        }

        return stack.size();
    }
}
