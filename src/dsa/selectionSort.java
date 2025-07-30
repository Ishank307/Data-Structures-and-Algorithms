package dsa;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,4,3,2,1};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			
			int last = arr.length -i-1;
			int maxIndex=getMax(arr,0,last);
			
			swap(arr,maxIndex,last);
		}
	}
	
	
	private static int getMax(int[] arr,int start,int end) {
		int max=start;
		for(int i=0;i<=end;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}

	private static void swap(int[] arr, int first,int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}
	
	

}
