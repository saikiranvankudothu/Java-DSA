package SearchingTechniques;

public class subArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                // System.out.print(" (" + arr[i] + " , " + arr[j] + ") ");
                System.out.print(" [");
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + ",");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }
}

// sum of the sub array
// package SearchingTechniques;

// public class subArray {
// public static void main(String[] args) {
// int[] arr = { 2, 4, 6, 8, 10 };
// int n = arr.length;
// for (int i = 0; i < n; i++) {
// int sum = 0;
// for (int j = i + 1; j <= n; j++) {
// // System.out.print(" (" + arr[i] + " , " + arr[j] + ") ");
// System.out.print(" [");

// for (int k = i; k < j; k++) {
// sum = sum + arr[k];
// }
// System.out.print(sum);
// System.out.print("]");
// sum = 0;
// }
// System.out.println();
// }
// }
// }
