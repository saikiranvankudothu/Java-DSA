package stacks;

import java.util.Stack;

public class dupparen {
    public static boolean isvalid(String str) {
        int n = str.length();
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }

            } else {
                s.push(ch);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+b)+(c-d)))";
        System.out.println(isvalid(str));
    }
}
