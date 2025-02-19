package SearchingTechniques;

public class KadanesAlgo {
    public static void kadane(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(cs, ms);
        }
        System.out.println("The max sum is " + ms);
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadane(arr);
    }
}
