package stacks;

import java.util.Stack;

public class nextgreaterelement {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nxtgreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtgreater[i] = -1;
            } else {
                nxtgreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nxtgreater[i] + " ");
        }
    }

}
