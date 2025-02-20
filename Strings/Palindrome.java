package Strings;

import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalin(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check: ");
        String str = sc.nextLine();
        if (checkPalin(str)) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("Not an Palindrome!");
        }
    }
}
