package arrays;

import java.util.Arrays;

/**
 * Your Solution class containing the problem's logic.
 */
class Solution {
    
}

/**
 * The Main class to run and test your code with examples.
 */
public class checkadnRotate {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] nums1 = {3, 4, 5, 1, 2}; // Expected: true
        int[] nums2 = {2, 1, 3, 4};    // Expected: false
        int[] nums3 = {1, 2, 3};       // Expected: true (rotated 0 times)
        int[] nums4 = {1, 1, 1};       // Expected: true
        int[] nums5 = {7, 9, 1, 2, 3}; // Expected: true
        
        System.out.println("Array: " + Arrays.toString(nums1) + " -> Is sorted and rotated? " + check(nums1));
        System.out.println("Array: " + Arrays.toString(nums2) + " -> Is sorted and rotated? " + check(nums2));
//        System.out.println("Array: " + Arrays.toString(nums3)
        
    }
    
    public static boolean check(int[] nums) {
    	int r=0;
    	int n=nums.length;
    	for(int i=n-1;i>0;i--) {
    		if (nums[i]<nums[i-1]) {
    			r=i;
    			break;
    		}
    		
    	}
    	
    	reverse(nums,0,r-1);
    	reverse(nums,r,n-1);
    	reverse(nums,0,n-1);
        
        for(int i=0;i<n-1;i++) {
        	if(nums[i]>nums[i+1])
        		return false;
        }
        
        return true;
    }
    
    
    private static void reverse(int[] arr,int start,int end) {
    	while(start<end) {
    		int temp=arr[start];
        	arr[start]=arr[end];
        	arr[end]=temp;
        	start++;
        	end--;
    	}
    }
}