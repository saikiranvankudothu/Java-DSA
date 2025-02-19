package SearchingTechniques.binarySearch;

public class BinarySearch {

    public int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key < arr[mid]) {
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] arr = { 2, 3, 6, 7, 8, 9 };
        int key = 17;
        int result = obj.search(arr, key);
        if (result == -1) {
            System.out.println("the key " + key + " not found!");
        } else {
            System.out.println("The Key " + key + " found at the location " + result);
        }
    }
}
