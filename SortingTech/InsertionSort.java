package SortingTech;

///:):):):):):):):):):):):):):):):):):):):):):):):):):):)
public class InsertionSort {
    public static void isort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 93, 1, 7, 5, 6, 35, 16 };
        isort(arr);
        print(arr);
    }

}
