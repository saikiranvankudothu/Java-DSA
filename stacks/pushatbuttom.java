import java.util.Stack;

public class pushatbuttom {
    public static void pushAtButtom(Stack<Integer> s, int n) {
        if (s.isEmpty()) {
            s.push(n);
            return;
        }
        int top = s.pop();
        pushAtButtom(s, n);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtButtom(s, 7);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}