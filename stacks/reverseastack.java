package stacks;

import java.util.*;

public class reverseastack {
    public static void pushAtButtom(Stack<Integer> s, int n) {
        if (s.isEmpty()) {
            s.push(n);
            return;
        }
        int top = s.pop();
        pushAtButtom(s, n);
        s.push(top);
    }

    public static void revs(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        revs(s);
        pushAtButtom(s, top);

    }

    public static void printStack(Stack<Integer> s) {
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // printStack(s);
        revs(s);
        printStack(s);
    }

}
