package SearchingTechniques;

public class ReverseArray {
    public static void revarr(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 8 };
        printArray(arr);
        revarr(arr);
        printArray(arr);

    }

    // helper funtion to print the array
    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
