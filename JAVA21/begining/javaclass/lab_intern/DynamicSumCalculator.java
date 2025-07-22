import java.util.Scanner;

public class DynamicSumCalculator {
    private static int evenSum = 0;
    private static int oddSum = 0;

    public static void main(String[] args) {
        // Take user input for 'n'
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'n': ");
        int n = scanner.nextInt();

        // Create threads for even and odd sums
        Thread evenThread = new Thread(() -> {
            for (int i = 0; i <= n; i += 2) {
                evenSum += i;
            }
        });

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= n; i += 2) {
                oddSum += i;
            }
        });

        // Start both threads
        evenThread.start();
        oddThread.start();

        try {
            // Wait for both threads to finish
            evenThread.join();
            oddThread.join();

            // Display the results
            System.out.println("Sum of even numbers from 0 to " + n + ": " + evenSum);
            System.out.println("Sum of odd numbers from 0 to " + n + ": " + oddSum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
