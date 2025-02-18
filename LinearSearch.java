
public class LinearSearch {
    public static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 7, 6, 9 };
        int key = 17;
        int result = search(arr, key);
        if (result == -1) {
            System.out.println("the key " + key + " not found!");
        } else {
            System.out.println("The Key " + key + " found at the location " + result);
        }

    }
}