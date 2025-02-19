package SearchingTechniques;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        int n = arr.length;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i + 1; j <= n; j++) {
                for (int k = i; k < j; k++) {
                    sum = sum + arr[k];
                }
                if (maxsum < sum) {
                    maxsum = sum;
                }
                sum = 0;
            }
        }
        System.out.println("The max sum is " + maxsum);
    }
}