package SearchingTechniques;

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        int n = arr.length;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxsum < sum) {
                    maxsum = sum;
                }
            }
        }
        System.out.println("The max sum is " + maxsum);
    }
}