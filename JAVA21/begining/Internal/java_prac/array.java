import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(7); 

        // Display the unsorted list
        System.out.println("Unsorted ArrayList: " + numbers);

        // Sort the ArrayList
        Collections.sort(numbers);

        // Display the sorted list
        System.out.println("Sorted ArrayList: " + numbers);
    }
}