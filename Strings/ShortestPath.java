package Strings;

public class ShortestPath {
    public static int shortestPath(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                x--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                y--;
            } else {
                return -1;
            }
        }
        // return new int[] { x, y };
        return (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

    }

    // public static double calshortestpath(int x, int y) {

    // return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    // }

    public static void main(String[] args) {
        // int[] coordinates = shortestPath("WNEENESENNN");
        // if (coordinates != null) {
        // double ans = calshortestpath(coordinates[0], coordinates[1]);
        // System.out.println("shortest path " + ans);
        // } else {
        // System.out.println("invalid input");
        // }
        int ans = shortestPath("WNEENESENNN");
        System.out.println("shortest path " + ans);
    }
}
