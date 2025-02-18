## Linear Search

Linear Search in Java
Linear Search is the simplest searching algorithm. It sequentially checks each element in the array until it finds the target element or reaches the end.

## How It Works

Start from the first element.
Compare each element with the target.
If a match is found, return the index.
If no match is found after checking all elements, return -1 (not found).

## Time Complexity

Best Case:
𝑂
(
1
)
O(1) → If the element is at the first position.

Worst Case:
𝑂
(
𝑛
)
O(n) → If the element is at the last position or not present at all.

Average Case:
𝑂
(
𝑛
)
O(n) → On average, we check half of the array.

Space Complexity
𝑂
(
1
)
O(1) → Uses constant extra space.

## Advantages

✅ Simple to implement

✅ Works well for small datasets

✅ No need for a sorted array

## Disadvantages

❌ Slow for large datasets compared to binary search

❌ Inefficient for sorted arrays

```
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
```
