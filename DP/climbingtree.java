import java.util.Arrays;

public class climbingtree {
    public static int fibo(int n, int f[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (f[n] != -1) {
            return f[n];
        }
        f[n] = fibo(n - 1, f) + fibo(n - 2, f);
        return f[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int f[] = new int[n + 1];
        Arrays.fill(f, -1);
        System.out.println(fibo(n, f));
    }
}
