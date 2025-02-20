package Arrays2D;

public class DiagonalSum {
    public static void printdiagonalsum(int matrix[][]) {
        int dsum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            dsum += matrix[i][i];
            if (i != n - 1 - i) {
                dsum += matrix[i][n - 1 - i];
            }
        }
        System.out.println(dsum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }, };
        printdiagonalsum(matrix);
    }
}
