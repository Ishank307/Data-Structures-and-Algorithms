package dsa;

import java.util.Arrays;


class Solution {
    
    public void insertionSort(int arr[]) {
        int n = arr.length;
        
        for(int i=0;i<n;i++) {
        	int j=i;
        	
        	while(j>0&&arr[j-1]>arr[j]) {
        		int temp=arr[j];
        		arr[j]=arr[j-1];
        		arr[j-1]=temp;
        		j--;
        		}
        	
        }
        
       
        
    }
}


public class insertionSort {
    public static void main(String[] args) {
        // Create an instance of your Solution class
        Solution sorter = new Solution();
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(testArray));
        
        // Call the sorting method
        sorter.insertionSort(testArray);
        
        // Print the array after sorting to verify the result
        System.out.println("Sorted Array:   " + Arrays.toString(testArray));
    }
}