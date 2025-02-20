// package Arrays2D;

public class SpiralMatrix {
    public static void printspiral(int matrix[][]) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;
        while (sr <= er && sc <= ec) {
            // Top row
            for (int j = sc; j <= ec; j++) {
                System.out.print(matrix[sr][j] + " ");
            }
            // Right column
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec] + " ");
            }
            // Bottom Row
            for (int j = ec - 1; j >= sc; j--) {
                if (sc == ec) {
                    break;
                }
                System.out.print(matrix[er][j] + " ");
            }
            // Right Column
            for (int i = er - 1; i >= sr + 1; i--) {
                if (sc == ec) {
                    break;
                }
                System.out.print(matrix[i][sc] + " ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printspiral(matrix);
    }
}