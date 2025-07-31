package arrays;

import java.util.Arrays;


public class SingleUniqueEle {
    public static void main(String[] args) {
        
        // Test cases
        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};
        
        System.out.println("Test 1: " +singleNumber(nums1)); // Expected: 1
        System.out.println("Test 2: " +singleNumber(nums2)); // Expected: 4
        System.out.println("Test 3: " +singleNumber(nums3)); // Expected: 1
    }
    
    public static int singleNumber(int[] nums) {
        int n = nums.length;
         Arrays.sort(nums);
         for (int i = 0; i < n - 1; i = i + 2) {
             if (nums[i] != nums[i + 1])
                 return nums[i];
         }

         return nums[n - 1];
// optimal Solution
//        int xor=0;
//
//        for(int i=0;i<nums.length;i++){
//            xor^=nums[i];
//        }
//
//        return xor;
    }
}