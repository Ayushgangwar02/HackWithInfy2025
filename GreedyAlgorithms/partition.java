package GreedyAlgorithms;

import java.util.*;

class partition {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int ans = 0;
        for (int i = 0; i < n; i += 2) {
            ans += nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        partition sol = new partition();

        int[] nums = { 1, 4, 3, 2, 6, 5 };
        int result = sol.arrayPairSum(nums);

        System.out.println("Maximum sum of min pairs: " + result);
    }
}
