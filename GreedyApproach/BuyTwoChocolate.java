package GreedyApproach;

import java.util.*;

class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int cheapestCost = prices[0];
        int secondCheapestCost = prices[1];

        int totalCost = cheapestCost + secondCheapestCost;

        if (totalCost <= money) {
            return money - totalCost;
        }
        return money;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter prices of chocolates:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.print("Enter amount of money: ");
        int money = sc.nextInt();

        Solution sol = new Solution();
        int leftover = sol.buyChoco(prices, money);

        System.out.println("Leftover money: " + leftover);
        sc.close();
    }
}
