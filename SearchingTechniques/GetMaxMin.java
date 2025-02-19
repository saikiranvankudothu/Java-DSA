package SearchingTechniques;

public class GetMaxMin {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    public int getMax(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int getMin(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 4, 32, 9, 46, 3, 67, 7, 25, 2, 35, 6, 5 };
        GetMaxMin obj = new GetMaxMin();
        int resultmax = obj.getMax(arr);
        System.out.println("Max from the given array is: " + resultmax);
        int resultmin = obj.getMin(arr);
        System.out.println("Min from the given array is: " + resultmin);

    }
}
