import java.util.Scanner;

public class MultiThreadedSumCalculator {
    private static int evenSum = 0;
    private static int oddSum = 0;

    public static void main(String[] args) {
        // Take user input for the range
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting value: ");
        int startRange = scanner.nextInt();
        System.out.print("Enter the ending value: ");
        int endRange = scanner.nextInt();

        Thread evenThread = new Thread(() -> calculateSum(startRange, endRange, true));
        Thread oddThread = new Thread(() -> calculateSum(startRange, endRange, false));

        evenThread.start();
        oddThread.start();

        try {
            // Wait for both threads to finish
            evenThread.join();
            oddThread.join();

            // Display the results
            System.out.println("Sum of even numbers from " + startRange + " to " + endRange + ": " + evenSum);
            System.out.println("Sum of odd numbers from " + startRange + " to " + endRange + ": " + oddSum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static void calculateSum(int start, int end, boolean isEven) {
        for (int i = start; i <= end; i++) {
            if ((isEven && i % 2 == 0) || (!isEven && i % 2 != 0)) {
                if (isEven) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
            }
        }
    }
}