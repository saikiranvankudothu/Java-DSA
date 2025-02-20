package SortingTech;

public class SelectionSort {
    public static void ssort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {// change the greater than sign to less than to change the order of sorting.
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 93, 1, 7, 5, 6, 35, 16 };
        ssort(arr);
        print(arr);
    }
}
