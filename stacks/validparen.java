package stacks;

import java.util.Stack;

public class validparen {
    public static boolean vpa(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if ((c == ')' && st.peek() == '(') || (c == ']' && st.peek() == '[')
                        || ((c == '}' && st.peek() == '{'))) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "{{[(})]}}";
        System.out.println(vpa(s));
    }
}
