package greedya;

import java.util.*;

public class Indiancoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());
        int numCoins = 0;
        int amount = 590;

        ArrayList<Integer> sum = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    numCoins++;
                    sum.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("the num of coins:" + numCoins);
        for (int i = 0; i < sum.size(); i++) {
            System.out.print(sum.get(i) + " ");
        }
    }
}
