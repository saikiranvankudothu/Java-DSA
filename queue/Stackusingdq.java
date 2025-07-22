package queue;

import java.util.*;

public class Stackusingdq {
    static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data) {
            dq.addLast(data);
        }

        public int pop() {
            return dq.removeLast();
        }

        public int peek() {
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.print(s.pop() + " ");
        System.out.print(s.peek() + " ");
        System.out.print(s.pop() + " ");
    }

}
