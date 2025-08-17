package arrays;

import java.util.*;

public class FourSumSolution {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // skip duplicates

                int left = j + 1;
                int right = nums.length - 1;

                long res = (long) nums[i] + nums[j];
                long total = (long) target - res;

                while (left < right) {
                    long sum = (long) nums[left] + nums[right];

                    if (sum == total) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) left++;  // skip duplicates
                        while (left < right && nums[right] == nums[right - 1]) right--; // skip duplicates

                        left++;
                        right--;
                    } else if (sum > total) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return result;
    }

    // main method for testing
    public static void main(String[] args) {
        FourSumSolution solution = new FourSumSolution();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = solution.fourSum(nums, target);
        System.out.println("Quadruplets: " + result);
    }
}
